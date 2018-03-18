package com.model;

/**
 * A pályán szereplő dobozokat reprezentáló osztály.
 */
public class Box extends Pushable{

    /**
     *
     * @param player játékos, ami a tolható elem helyére szeretne lépni
     * @param direction a játékos haladási iránya
     * @return true-val tér vissza ha a lépés sikeres volt, false-szal ha nem
     */
    @Override
    public boolean hit(Player player, Direction direction) {
        return super.hit(player, direction);
    }

    /**
     * @param pushable az új elem, ami a jelenlegi tolható elem helyére szeretne lépni
     * @param direction az elem továbbhaladási iránya
     * @return true-val tér vissza ha a lépés sikeres volt, false-szal ha nem
     */
    @Override
    public boolean hit(Pushable pushable, Direction direction) {
        return super.hit(pushable, direction);
    }
}

