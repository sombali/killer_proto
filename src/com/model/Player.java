package com.model;

public abstract class Player extends Element{
    private String name;
    private int point;

    public void move(Direction direction) {

    }

    public void die() {

    }

    public void addPoints(int point) {
        this.point += point;
    }

    public void surrender() {

    }

    public void win() {

    }

    public boolean hit(Pushable pushable, Direction direction) {
        return false;
    }

    public  boolean hit(Player player, Direction direction) {
        return false;
    }

    public void step(Field field){}

}
