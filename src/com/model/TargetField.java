package com.model;

public class TargetField extends Field {

    Player player = new Worker();

    @Override
    public void stepOnIt(Pushable pushable) {
        System.out.println("[TargetField :targetField].stepOnIt(box)");
        player.addPoints(10);
    }

    @Override
    public void removeElement(Pushable pushable) {
        System.out.println("[TargetField :targetField].removeElement(box)");
        super.removeElement(pushable);
        player.addPoints(-10);
    }
}
