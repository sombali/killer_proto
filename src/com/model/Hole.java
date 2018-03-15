package com.model;

public class Hole extends Field{

    @Override
    public void stepOnIt(Element element) {
        super.stepOnIt(element);
    }

    //Na itt vagyunk szarba mert nem ismeri a warehouset a Field... @Bazsi
    @Override
    public void stepOnIt(Pushable pushable) {
        removeElement(pushable);

    }

    @Override
    public void stepOnIt(Player player) {
        super.stepOnIt(player);
    }
}
