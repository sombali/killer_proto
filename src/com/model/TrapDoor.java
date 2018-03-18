package com.model;

import java.util.Scanner;

/**
 * Ez a játékban szereplő csapóajtót reprezentáló osztály.
 */
public class TrapDoor extends Hole {

    /**
     * @param aSwitch A TrapDoorhoz tartozó, őt nyitó/záró kapcsoló(Switch).
     */
    private Switch aSwitch;

    /**
     * @param state A TrapDoor éppeni állatopát tárolja.
     */
    private TrapDoorState state = TrapDoorState.CLOSED;

    /**
     * @param in A tesztesetek beolvasását teszi lehetővé.
     *
     */
    Scanner in = new Scanner(System.in);

    /**
     *   A felhasználótól bekért teszteset választásokat tárolja.
     */
    int x;

    /**
     *
     * @param pushable a mezőn álló tolható objektum
     *  Ezt az objektum mezőről való eltávolítását végzi a metódus.
     */
    @Override
    public void removeElement(Pushable pushable) {
        System.out.println("-->[Field :f2].removeElement(player)");
    }

    /**
     *
     * @param player játékos, ami a mezőre lépett
     * Ez a függvény fogja kiváltani azt a hatást ami történik mikor rálép egy játékos.
     * Ha a Trapdoor nyitva van a játékos meghal, ha nem akkor szimpla mezőként funkcionál.
     *
     */
    @Override
    public void stepOnIt(Player player) {
        System.out.println("-->[TrapDoor :t].stepOnIt(player)");
        if(x == 1) {
            state = TrapDoorState.OPENED;
            removeElement(player);
            player.die();
        } else {
            return;
        }
    }

    /**
     *
     * @return visszatér azzal az Element-tel ami a TrapDooron áll.
     */
    @Override
    public Element getElement() {
        System.out.println("Nyitva van a trapdoor? 1-Igen, 2-Nem");
        x = in.nextInt();
        if (x == 1) {
            System.out.println("-->[Field :f2].getElement()");
            System.out.println("<--[return null]");
            return null;
        } else if (x == 2) {
            return new Field().getElement();
        } else {
            return null;
        }
    }

    /**
     * Ez a függvény felelős azért, hogy a Trapdoor állapotát (nyitott vagy zárt) változtassa.
     */
    public void switchState() {
        System.out.println("[TrapDoor :td].switchState()");
        System.out.println("TrapDoor -> Megvaltozott a Trapdoor allapota!");
        if(state.equals(TrapDoorState.CLOSED)) {
            state = TrapDoorState.OPENED;
        } else {
            state = TrapDoorState.CLOSED;
        }
    }
}
