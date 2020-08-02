package com.yuandengta.principle.openclose.v2;

/**
 * TODO {@link Client}
 *
 * @Author:Mars
 * @wx:10769582
 */
public class Client {
    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Other());

        //  有问题否？   业务需求：  绘制三角形
    }

}

//这是一个用于绘图的类 [使用方]
class GraphicEditor {
    //接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s) {

        //图形里面直接提供绘画方法
     s.draw();
    }
//  Shape 与  GraphicEditor什么关系  依赖关系

  }

//Shape类，基类
abstract  class Shape {
    int m_type;

    public abstract  void draw();
}

//矩形
class Rectangle extends Shape {
    Rectangle()
    {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形 ");
    }
}

//圆形
class Circle extends Shape {
    Circle() {

        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//三角形
class Triangle extends Shape {
    Triangle() {

        super.m_type = 3;
    }
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
//业务变化：  增加图形
class Other extends Shape{

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}

