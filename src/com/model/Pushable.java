package com.model;

/**
 * Tolható objektumot reprezentáló osztály
 */
public abstract class Pushable extends Element {

    /**
     * Jelzi, hogy az objektum semelyik irányba sem mozdítható
     */
    private boolean stucked;

    /**
     * A mozgathato objektum sulya.
     */
    private int weight;

    /**
     * Játékos szeretné tolni a tolható elemet a továbbhaladás irányába.
     * @param player játékos, ami a tolható elem helyére szeretne lépni
     * @param direction a játékos haladási iránya
     * @return lépés sikeressége
     */
    public boolean hit(Player player, Direction direction) {
        System.out.println("-->[Box :b].hit(worker, direction)");

        //
        Field nextField = getField().getNeighbors(direction);
        Element element1 = nextField.getElement();

        nextField.setElement(element1);
        if(element1 != null) {
            element1.setTestField(nextField);
        }

        /*
         * Ha nem üres a szomszéd mező, megnézi, hogy az az elem tovább tud tolódni,
         * ha sikerült, a tolható elem is továbblép és jelzi, hogy sikerült lépnie.
         * Ha üres a szomszéd mező, továbblép, és jelzi a lépés sikerességét
         */
        boolean allowed = true;
        if(element1 != null) {
            allowed = element1.hit(this, direction);
            if(allowed) {
                step(nextField);
            }
        } else {
            step(nextField);
            System.out.println("<--- true");
            return true;
        }
        System.out.println("<---" + " " + allowed);
        return allowed;
    }

    /**
     * Egy másik tolható elem szeretné tolni az elemet a továbbhaladás irányába.
     * @param pushable az új elem, ami a jelenlegi tolható elem helyére szeretne lépni
     * @param direction az elem továbbhaladási iránya
     * @return lépés sikeressége
     */
    public boolean hit(Pushable pushable, Direction direction) {
        System.out.println("-->[Box :b].hit(box, direction)");

        Field nextField = getField().getNeighbors(direction);
        Element element1 = nextField.getElement();

        nextField.setElement(element1);

        if(element1 != null) {
            element1.setTestField(nextField);
        }

        /*
         * Ha nem üres a szomszéd mező, megnézi, hogy az az elem tovább tud tolódni,
         * ha sikerült, a tolható elem is továbblép és jelzi, hogy sikerült lépnie.
         * Ha üres a szomszéd mező, továbblép, és jelzi a lépés sikerességét
         */
        boolean allowed = true;
        if(element1 != null) {
            allowed = element1.hit(this, direction);
            if(allowed) {
                step(nextField);
            }
        } else {
            step(nextField);
            System.out.println("<---" + " " + true);
            return true;
        }
        System.out.println("<---" + " " + allowed);
        return allowed;
    }

    /**
     * Rálép a szomszédos mezőre
     * @param nextField a szomszédos mező
     */
    public void step(Field nextField) {
        getField().removeElement(this);
        nextField.acceptElement(this);
        stuck();
        nextField.stepOnIt(this);
    }


    public void stuck() {

    }
}
