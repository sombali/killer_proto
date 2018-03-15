package com.model;

public class TargetField extends Field {

    Player player;

    public void increasePoint() {

    }

    @Override
    public void stepOnIt(Pushable pushable) {
        player.addPoints(10);
    }

    @Override
    public void stepOnIt(Player player) {

    }

    //Itt nem lehet az Osbol orokolni mert ott Element van itt meg csak Pushablet var paramterkent
    public void removeBox(Pushable pushable) {
        removeElement(pushable);
        player.addPoints(-10);
    }
}
