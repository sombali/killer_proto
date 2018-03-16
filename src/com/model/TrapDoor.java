package com.model;

public class TrapDoor extends Hole {
    private Switch aSwitch;
    private TrapDoorState state = TrapDoorState.CLOSED;


    @Override
    public void stepOnIt(Element element) {
<<<<<<< HEAD

        super.stepOnIt(element);
        System.out.println("-->[TrapDoor td].stepOnIt(Element element)"); //@Ákos
    }

    public void switchState() {
        System.out.println("<--[TrapDoor td].switchState()");//@Ákos

=======
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
>>>>>>> 24a23e1ccb672ea49336b7805352291637a64328
    }
}
