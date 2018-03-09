package com.model;

public abstract class Blockage extends Element{
    private boolean stucked;

    public boolean hit(Element element, Direction direction) {
        return false;
    }




}
