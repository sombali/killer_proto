package com.model;

public abstract class Player extends Element{
    private String name;
    private int point;

    public void move(Direction direction) {

    }

    public void die() {
        System.out.println("-->[Worker :w].die");
        System.out.println("YOU DIED!");
        System.out.println("<-----");
    }

    public void addPoints(int point) {
        System.out.println("[Worker :w].addPoint(point)");
        this.point += point;
    }

    public void surrender() {
        System.out.println("-->[Worker :w1].surrend");
        System.out.println("Player1 LOST!");
        System.out.println("Player2 WON!");
        System.out.println("<-----");
    }

    public void win() {
        System.out.println("-->[Worker :w1].win");
        System.out.println("Player1 WIN!");
        System.out.println("Player2 LOST!");
        System.out.println("<-----");
    }

    //szekvencia alapjan kitoltottem @Bazsi
    //az egy dolog de ki is kene iratni draga Bazsi @Szili
    public boolean hit(Pushable pushable, Direction direction) {
        System.out.println("[Worker :w].hit(box, direction)");
        Field nextfield = getField().getNeighbors(direction);
        Element element = nextfield.getElement();

        if(element != null) {
            this.getField().removeElement(this);
            die();
            return true;
        } else {
            step(nextfield);
            return true;
        }
    }

    public  boolean hit(Player player, Direction direction) {
        return false;
    }

    //ideraktam a Workerbol a stepet, gondolvan hogy csak valositsa meg ezt @Bazsi (Zsir)
    public void step(Field nextField) {
        System.out.println("->[Worker :w].step(f2)");
        field.removeElement(this);
        nextField.acceptElement(this);
      //this.setField(nextField);
        nextField.stepOnIt(this);
        System.out.println("<-");
    }

}
