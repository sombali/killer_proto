package com.model;

public class Element {
    Field field;

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public boolean hit(Element element, Direction direction) {
        return true;
    }
}
