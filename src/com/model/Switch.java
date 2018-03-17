package com.model;

public class Switch extends Field {

    private TrapDoor trapDoor = new TrapDoor();

    public TrapDoor getTrapDoor() {
        System.out.println("-->[Switch: s].getTrapDoor()");
        return trapDoor;
    }


    @Override
    public void stepOnIt(Pushable pushable) {
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
