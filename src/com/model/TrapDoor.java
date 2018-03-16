package com.model;

public class TrapDoor extends Hole {
    private Switch aSwitch;
    private TrapDoorState state = TrapDoorState.CLOSED;


    @Override
    public void stepOnIt(Element element) {
        if(state.equals(TrapDoorState.OPENED)) {
            removeElement(el);
        }
    }

    public void switchState() {
        if(state.equals(TrapDoorState.CLOSED)) {
            state = TrapDoorState.OPENED;
        } else {
            state = TrapDoorState.CLOSED;
        }
    }
}
