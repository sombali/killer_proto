package com.model;

public class Box extends Pushable{

    @Override
    public boolean hit(Player player, Direction direction) {
        return super.hit(player, direction);
    }

    @Override
    public boolean hit(Pushable pushable, Direction direction) {
        return super.hit(pushable, direction);
    }
}

