package com.model;

/**
 * A mezőkön található elemek gyűjtő csoportja és az ezen elemek közös
 * attribútumait, metódusait valósítja meg.
 */
public class Element {
    /**
     * @param field Az a maző amin az adott Element áll.
     */
    Field field;

    /**
     *
     * @return Visszatér azzal a mezővel amin a játékos jelen pillanatban áll.
     */
    public Field getField() {
        return field;
    }

    /**
     *
     * @param field Egy mező objektum
     * A metódus az adott Element jelenlegi mezőjét hivatott beállítani.
     */
    public void setField(Field field) {
        System.out.println("-->.setField(f2) = Sikeres lepes");
        this.field = field;
    }

    /**
     *
     * @param field Egy mező objektum.
     * A metódus az adott Element jelenlegi mezőjét hivatott beállítani.
     */
    //ezt a szkeleton utan torolni kell!!!!
    public void setTestField(Field field){
        this.field = field;
    }

    /**
     *
     * @param element Egy Element objektum.
     * @param direction Egy adott irány.
     * @return true-val tér vissza ha a lépés sikeres volt, false-szal ha nem
     */
    public boolean hit(Element element, Direction direction) {
        return true;
    }

    /**
     *
     * @param player Egy Player objektum.
     * @param direction Egy adott irány.
     * @return true-val tér vissza ha a lépés sikeres volt, false-szal ha nem
     */
    public boolean hit(Player player,Direction direction){
        return true;
    }

    /**
     *
     * @param pushable Egy Pushable objektum.
     * @param direction Egy adott irány.
     * @return true-val tér vissza ha a lépés sikeres volt, false-szal ha nem
     */
    public boolean hit(Pushable pushable,Direction direction){
        return true;
    }

}
