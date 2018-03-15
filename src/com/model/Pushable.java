package com.model;

public abstract class Pushable extends Element{
    private boolean stucked;

    //@Bazsi voltam haligali
    public boolean hit(Element element, Direction direction) {
        Field nextField = getField().getNeighbors(direction);
        Element element1 = nextField.getElement();
        boolean allowed = true;
        if(element1 != null) {
            allowed = hit(element1, direction);
        } else {
            step(nextField);
        }
        return allowed;
    }

    //@Bazsi voltam, hozza ne nyulj kezed eltorom
    public void step(Field nextField) {
        getField().removeElement(this);
        nextField.acceptElement(this);
        stuck();
        nextField.stepOnIt(this);
    }

    public void stuck() {

    }
}
