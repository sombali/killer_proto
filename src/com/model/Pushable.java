package com.model;

public abstract class Pushable extends Element{
    private boolean stucked;

    //@Bazsi voltam haligali
    public boolean hit(Player player, Direction direction) {
        System.out.println("-->[Pushable: pushable].hit(player,d)");
        System.out.println("%%%%%" + getField());

        Field nextField = getField().getNeighbors(direction);
        Element element1 = nextField.getElement();

        //Elmagyarazom majd ez mi , kell azert mert maskepp nem lesz jo.
        nextField.setElement(element1);
        element1.setTestField(nextField);

        boolean allowed = true;
        if(element1 != null) {
            allowed = element1.hit(this, direction);
        } else {
            step(nextField);
            return true;
        }
        System.out.println("<---" + allowed);
        return allowed;
    }

    public boolean hit(Pushable pushable, Direction direction) {
        System.out.println("-->[Pushable: pushable].hit(pushable,d)");
        System.out.println("%%%%%" + getField());
        Field nextField = getField().getNeighbors(direction);
        Element element1 = nextField.getElement();

        //Elmagyarazom majd ez mi , kell azert mert maskepp nem lesz jo.
        nextField.setElement(element1);
        element1.setTestField(nextField);

        boolean allowed = true;
        if(element1 != null) {
            allowed = element1.hit(this, direction);
        } else {
            step(nextField);
            return true;
        }
        System.out.println("<---" + allowed);
        return allowed;
    }

    //@Bazsi voltam, hozza ne nyulj kezed eltorom
    public void step(Field nextField) {
        Field mytestfield = new Field();
        mytestfield.removeElement(this);
        nextField.acceptElement(this);
        stuck();
        nextField.stepOnIt(this);
    }

    public void stuck() {

    }
}
