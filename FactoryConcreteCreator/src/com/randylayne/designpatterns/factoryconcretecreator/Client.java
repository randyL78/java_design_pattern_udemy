package com.randylayne.designpatterns.factoryconcretecreator;

public class Client {
    public static void main(String[] args) {
        ConcreteShapeFactory shapeFactory = new ConcreteShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();
        Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape2.draw();
        Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);
        shape3.draw();
    }
}