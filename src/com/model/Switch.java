package com.model;

public class Switch extends Field {

    private TrapDoor trapDoor;

    public TrapDoor getTrapDoor() {
        return trapDoor;
    }

    //@Bazsa vót
    @Override
    public void stepOnIt(Pushable pushable) {
        getTrapDoor().switchState();
        Element element = trapDoor.getElement();

        if(element != null) {
            trapDoor.stepOnIt(element);
        }
    }

    //Ezis Bazsa
    @Override
    public void removeElement(Element element) {
        super.removeElement(element);
        trapDoor.switchState();
    }
}
