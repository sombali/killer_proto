package com.model;

public abstract class Blockage extends Element{
    private boolean stucked;

    public boolean hit(Player elemente, Direction direction) {

        System.out.println("-->[Wall :w].hit(worker,direction)");
        System.out.println("<--false == Nem tudsz ide Lepni");
        return false;
    }

    public boolean hit(Pushable pushable, Direction direction) {
        System.out.println("-->[Wall :w].hit(worker,direction)");
        System.out.println("<--false == Nem tudsz ide Lepni");
        return false;
    }

}
