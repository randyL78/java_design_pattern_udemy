package com.randylayne.designpatterns.factoryconcretecreator;

public enum ShapeType {
    CIRCLE("Circle"),
    RECTANGLE("Rectangle"),
    SQUARE("Square");

    public String label;

    ShapeType(String label) {
        this.label = label;
    }
}
