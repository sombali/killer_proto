package com.model;

public class Field {
    private Element element;
    Direction direction;
    private Field[] neighbors;

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Field() {

    }

    public void acceptElement(Element element) {

    }

    public void removeElement(Element element) {

    }

    //TODO
    public Field getNeighbors(Direction direction) {
        return new Field();
    }

    public void setNeighbors(Direction direction, Field field) {

    }

    public void stepOnIt(Element element) {

    }

    public void stepOnIt(Pushable pushable) {

    }

    public void stepOnIt(Player player) {

    }
}
