package com.model;

/**
 * A TrapDoor nyitásáért felelős mező
 * Csak tolható objektum hatására változtatja csapóajtója állapotát, minden más elemre egyszerű mezőként viselkedik
 */
public class Switch extends Field {

    /**
     * A mezőhőz tartozó csapóajtó
     */
    private TrapDoor trapDoor = new TrapDoor();

    /**
     * Megadja a hozzátartozó csapóajtót
     * @return csapóajtó
     */
    public TrapDoor getTrapDoor() {
        System.out.println("-->[Switch :s].getTrapDoor()");
        return trapDoor;
    }

    /**
     * Pushable objektum a mezőre lépéskor kinyitja a hozzátartozó csapóajtót
     * Ha valamilyen elem állt a csapóajtón, az eltűnik/meghal
     * @param pushable tolható objektum, amely rálépett a mezőre
     */
    @Override
    public void stepOnIt(Pushable pushable) {
        System.out.println("-->[Switch :s].stepOnIt()");
        getTrapDoor().switchState();

        Element element = trapDoor.getElement();

        if(element != null) {
            trapDoor.stepOnIt(element);
        }
    }


    /**
     * Pushable objektum a mező elhagyásakor bezárja a hozzátartozó csapóajtót
     * @param pushable tolható objektum, amely elhagyja a mezőt
     */
    @Override
    public void removeElement(Pushable pushable) {
        System.out.println("-->[Switch :s].removeElement(box)");
        super.removeElement(pushable);
        trapDoor.switchState();
    }
}
