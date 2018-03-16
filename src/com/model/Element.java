package com.model;

public class Element {
    Field field;

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        System.out.println("       -->.setField(f2) = Sikeres lepes");
        this.field = field;
    }

    public boolean hit(Element element, Direction direction) {
        return true;
    }
    public boolean hit(Player player,Direction direction){
        return true;
    }
    public boolean hit(Pushable boxes,Direction direction){
        return true;
    }

}
