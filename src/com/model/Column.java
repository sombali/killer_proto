package com.model;

public class Column extends Blockage {
    @Override
    public boolean hit(Player elemente, Direction direction) {
        System.out.println("-->[Column: c].hit(worker,direction)");
        System.out.println("<--false == Nem tudsz ide Lepni");
        return false;
    }
}
