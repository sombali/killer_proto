package com.model;

public class Switch extends Field {

    private TrapDoor trapDoor;

    public TrapDoor getTrapDoor() {
        System.out.println("-->[Switch s].getTrapDoor()");
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
    public void removeElement(Player player) {
        super.removeElement(player);
        trapDoor.switchState();
    }
}
