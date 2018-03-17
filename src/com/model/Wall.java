package com.model;

public class Wall extends Blockage {

    @Override
    public boolean hit(Player player, Direction direction) {
        System.out.println("-->[Wall :w].hit(worker, direction)");
        System.out.println("<--false == Nem tudsz ide Lepni");
        return false;
    }

    @Override
    public boolean hit(Pushable pushable, Direction direction) {
        System.out.println("-->[Wall :w].hit(box, direction)");
        System.out.println("<--false == Nem tudsz ide Lepni");
        return false;
    }
}
