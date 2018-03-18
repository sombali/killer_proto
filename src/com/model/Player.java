package com.model;

/**
 * Az összes (még jövőben lehetséges) játékos közös attribútimait, metódusait foglalja magában.
 */

public abstract class Player extends Element{

    /**
     * @param name A játékos nevét tárolja.
     */
    private String name;

    /**
     * @param point A játékos pontját tárolja.
     */
    private int point;

    /**
     *
     * @param direction Az adott irány amelybe a játékos lépni fog.
     *                  A játékos mozgását valósítja meg.
     */
    public void move(Direction direction) {

    }

    /**
     * Ha meghal a játékos(pl: lyukba lép) akkor hívódik meg.
     */
    public void die() {
        System.out.println("-->[Worker :w].die()");
        System.out.println("YOU DIED!");
        System.out.println("<-----");
    }

    /**
     *
     * @param point A játékos pontszámának megváltoztatása a legfőbb feladata a függvénynek.
     */
    public void addPoints(int point) {
        System.out.println("[Worker :w].addPoint(point)");
        this.point += point;
    }

    /**
     * Minden játékos rendelkezik a feladás lehetőségével,
     * mikor élni kíván vele egy játékos ez a metódus hívódik meg.
     */
    public void surrender() {
        System.out.println("-->[Worker :w1].surrend");
        System.out.println("Player1 LOST!");
        System.out.println("Player2 WON!");
        System.out.println("<-----");
    }

    /**
     * A függvény meghívódik ha az egyik játékos nyert, tehát az összes saját területén láda áll.
     */
    public void win() {
        System.out.println("-->[Worker :w1].win");
        System.out.println("Player1 WIN!");
        System.out.println("Player2 LOST!");
        System.out.println("<-----");
    }

    //szekvencia alapjan kitoltottem @Bazsi
    //az egy dolog de ki is kene iratni draga Bazsi @Szili

    /**
     *
     * @param pushable Egy tolható objektum.
     * @param direction Egy adott irány.
     * @return true-val tér vissza ha a lépés sikeres volt, false-szal ha nem.
     */
    public boolean hit(Pushable pushable, Direction direction) {
        System.out.println("-->[Worker :w].hit(box, direction)");
        Field nextfield = getField().getNeighbors(direction);
        Element element = nextfield.getElement();

        if(element != null) {
            this.getField().removeElement(this);
            die();
            return true;
        } else {
            step(nextfield);
            System.out.println("<-- true");
            return true;
        }
    }


    /**
     *
     * @param player Egy játékos objektum
     * @param direction Egy adott irány
     * @return false-al tér vissza
     */
    public  boolean hit(Player player, Direction direction) {
        System.out.println("-->[Worker :w].hit(worker, direction)");
        System.out.println("<-- false == Nem tudsz ide lepni!");
        return false;
    }

    /**
     *
     * @param nextField az a mező amelyre az adott Player lépni fog.
     * A step metódus beállítja a következő mezőt a játékos mezőjének,
     * és meghívja ennek a mezőnek a stepOnIt függvényét ami a mezőre
     * rálépéskor kiváltó eseményt indítja el.
     */
    //ideraktam a Workerbol a stepet, gondolvan hogy csak valositsa meg ezt @Bazsi (Zsir)
    public void step(Field nextField) {
        System.out.println("->[Worker :w].step(f2)");
        field.removeElement(this);
        nextField.acceptElement(this);
        nextField.stepOnIt(this);
        System.out.println("<-");
    }

}
