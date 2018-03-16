package com.model;

public class Hole extends Field{

    //Ugye
    @Override
    public Element getElement(){

        return null;
    }
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
        System.out.println("->[Hole: h].stepOnIt(player)");
        removeElement(player);
        player.die();
        System.out.println("<-");
    }
}
