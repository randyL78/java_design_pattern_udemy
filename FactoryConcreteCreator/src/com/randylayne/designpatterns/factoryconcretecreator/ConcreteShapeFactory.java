package com.randylayne.designpatterns.factoryconcretecreator;

public class ConcreteShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        if(shapeType == null) {
            return null;
        }

        Shape shape;
        String className = "com.randylayne.designpatterns.factoryconcretecreator." + shapeType.label;

        try {
            shape = (Shape) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            shape = null;
        }
        return shape;
    }
}
