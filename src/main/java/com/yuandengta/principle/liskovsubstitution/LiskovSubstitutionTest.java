package com.yuandengta.principle.liskovsubstitution;


import java.util.HashMap;
import java.util.Map;

/**
 * TODO {@link LiskovSubstitutionTest}
 *
 * @Author:Mars
 * @wx:10769582
 */
public class LiskovSubstitutionTest {
    public static void main(String[] args) {
        XxxService service = new XxxService(new RedisCentralCacheManagerService());
        service.doXxxService("key2");
    }
}

class XxxService {
    // 缓存
    private CacheManagerService cm;

    public XxxService(CacheManagerService cm) {
        this.cm = cm;
    }

    // 业务
    public String doXxxService(String key) {

        return cm.get(key);
    }


}

// 单机JVM的缓存服务
class CacheManagerService {
    // 没有考虑并发场景
    static Map<String, String> cache = new HashMap<>();

    static {
        cache.put("key1", "value1");
    }


    /**
     * 获取
     *
     * @param key
     * @return 如果缓存返回值为null或者""  则直接返回null
     */
    public String get(String key) {
        //只能保证百分之九十九的情况下数据的准确性
        String s = cache.get(key);
        System.out.println("父类没有判断，直接返回 ： " +s);
        return s;
    }

    // 添加
    public void put(String key, String value) {
        cache.put(key, value);
    }


}

// 基于Redis的集中式缓存管理
class RedisCentralCacheManagerService extends CacheManagerService {
    // Redis实现
    static Map<String, String> redisCache = new HashMap<>();
    // 未考虑并发情况，直接使用HashMap当容器
    private static Map<String, String> db = new HashMap<>();

    static {
        redisCache.put("key1", "value1");
        db.put("key2","value2");
    }


    @Override
    public String get(String key) {
        //解决数据准确性问题，比如redis数据缓存失效，
        // 但是此时定时任务没有触发db重新将数据刷入缓存这百分之一情况
        String cacheValue = redisCache.get(key);
        if(cacheValue == null){
            //没有就从数据库里面取
            String s = db.get(key);
            System.out.println("子类做了判断,从数据库查询返回 ： " +s);
           //更新redis
            redisCache.put(key,s);
            return s;
        }
        System.out.println("子类也有数据，查询返回 ： " +cacheValue);
        return cacheValue;
    }

    /**
     *
     * @param key
     * @param value
     * 优化：
     *     put之前做判断 为null则添加 empty
     *     缓解了DB的压力 不需要selectData(key)了
     */
    @Override
    public void put(String key, String value) {

       //if(setNx("lock_key"+key, value)){
           //设置锁超时
          // cache.put(key,value);
           //业务完成，删除锁，放入其他线程
     //  }else{
           //未拿到锁的线程继续调用put方法
            //Thread.sleep(100);
       //    put(key, value);
    //}
    }

    /*
      虽然子类 较父类 保证了 数据的准确性  但是违背了里氏替换原则

     */
}
