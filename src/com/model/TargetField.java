package com.model;

/**
 * A kijelölt mező, amire a ládákat tolni kell
 * Ha a mezőre láda lép, játékosa pontot kap, ha a mezőről a láda eltolódik, a játékos pontot veszít
 */
public class TargetField extends Field {

    /**
     * A mezőhöz tartozó játékos
     */
    Player player = new Worker();

    /**
     * A mezőre tolható elem lép, a játékos pontot kap
     * @param pushable a mezőre lépett tolható elem
     */
    @Override
    public void stepOnIt(Pushable pushable) {
        System.out.println("[TargetField :targetField].stepOnIt(box)");
        player.addPoints(10);
    }

    /**
     * A mezőről odébbtolódik a tolható elem, a játékos pontot veszít
     * @param pushable a mezőről lelépő tolható elem
     */
    public void removeElement(Pushable pushable) {
        System.out.println("[TargetField :targetField].removeElement(box)");
        super.removeElement(pushable);
        player.addPoints(-10);
    }
}
