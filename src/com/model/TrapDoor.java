package com.model;

public class TrapDoor extends Hole {
    private Switch aSwitch;


    @Override
    public void stepOnIt(Element element) {

        super.stepOnIt(element);
        System.out.println("-->[TrapDoor td].stepOnIt(Element element)"); //@Ákos
    }

    public void switchState() {
        System.out.println("<--[TrapDoor td].switchState()");//@Ákos

    }
}
