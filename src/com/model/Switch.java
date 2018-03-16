package com.model;

public class Switch extends Field {

    private TrapDoor trapDoor;

    public TrapDoor getTrapDoor() {
        System.out.println("-->[Switch: s].getTrapDoor()");
        return new TrapDoor();
    }


    @Override
    public void stepOnIt(Pushable pushable) {
        System.out.println("LEPTEM TESOOOOOOOOOO");
        getTrapDoor().switchState();
        Element element = trapDoor.getElement();

        if(element != null) {
            trapDoor.stepOnIt(element);
        }
    }


    @Override
    public void removeElement(Pushable pushable) {
        super.removeElement(pushable);
        trapDoor.switchState();
    }
}
