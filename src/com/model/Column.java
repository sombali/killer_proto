package com.model;

public class Column extends Blockage {
    @Override
    public boolean hit(Player player, Direction direction) {
        System.out.println("-->[Column :c].hit(worker, direction)");
        System.out.println("<--false == Nem tudsz ide Lepni");
        return false;
    }

    @Override
    public boolean hit(Pushable pushable, Direction direction) {
        System.out.println("-->[Column :c].hit(box, direction)");
        System.out.println("<--false == Nem tudsz ide Lepni");
        return false;
    }
}
