package com.model;

public class TargetField extends Field {

    Player player = new Worker() ;


    public void increasePoint() {

    }

    @Override
    public void stepOnIt(Pushable pushable) {
        player.addPoints(10);
    }

    @Override
    public void stepOnIt(Player player) {

    }

    public void removeElement(Pushable pushable) {
        super.removeElement(pushable);
        player.addPoints(-10);
    }
}
