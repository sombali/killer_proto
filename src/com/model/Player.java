package com.model;

public abstract class Player extends Element{
    private String name;
    private int point;

    public void move(Direction direction) {

    }

    public void die() {
        System.out.println("-->[Player].die");
        System.out.println("YOU DIED!");
        System.out.println("<-----");
    }

    public void addPoints(int point) {
        this.point += point;
    }

    public void surrender() {
        System.out.println("-->[Player: player1].surrend");
        System.out.println("Player1 LOST!");
        System.out.println("Player2 WON!");
        System.out.println("<-----");
    }

    public void win() {
        System.out.println("-->[Player: player1].win");
        System.out.println("Player1 WIN!");
        System.out.println("Player2 LOST!");
        System.out.println("<-----");
    }

    //szekvencia alapjan kitoltottem @Bazsi
    //az egy dolog de ki is kene iratni draga Bazsi @Szili
    public boolean hit(Pushable pushable, Direction direction) {
        Field nextfield = getField().getNeighbors(direction);
        Element element = nextfield.getElement();

        if(element != null) {
            this.getField().removeElement(this);
            die();
        } else {
            step(nextfield);
            return true;
        }
        return true;
    }

    public  boolean hit(Player player, Direction direction) {
        return false;
    }

    //ideraktam a Workerbol a stepet, gondolvan hogy csak valositsa meg ezt @Bazsi (Zsir)
    public void step(Field nextField) {
        System.out.println("->[Player player].step");
        field.removeElement(this);
        nextField.acceptElement(this);
      //this.setField(nextField);
        nextField.stepOnIt(this);
        System.out.println("<-");
    }

}
