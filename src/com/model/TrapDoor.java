package com.model;

import java.util.Scanner;

public class TrapDoor extends Hole {
    private Switch aSwitch;
    private TrapDoorState state = TrapDoorState.CLOSED;
    Scanner in = new Scanner(System.in);
    int x;


    @Override
    public void removeElement(Player player) {
        System.out.println("-->[Field :f2].removeElement(player)");
    }

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

    @Override
    public Element getElement() {
        System.out.println("Nyitva van a trapdoor? 1-Igen, 2-Nem");
        x = in.nextInt();
        if (x == 1) {
            System.out.println("-->[Field f2].getElement()");
            System.out.println("<--[return null]");
            return null;
        } else if (x == 2) {
            return new Field().getElement();
        } else {
            return null;
        }
    }


    public void switchState() {
        System.out.println("[TrapDoor :td].switchState()");
        if(state.equals(TrapDoorState.CLOSED)) {
            System.out.println("TrapDoor -> OPENED");
            state = TrapDoorState.OPENED;
        } else {
            System.out.println("TrapDoor -> OPENED");
            state = TrapDoorState.CLOSED;
        }
    }
}
