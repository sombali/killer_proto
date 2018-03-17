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

    @Override
    public void stepOnIt(Pushable pushable) {
        System.out.println("->[Hole: h].stepOnIt(box)");
        System.out.println("Elpusztult a doboz!");
        removeElement(pushable);
        new Warehouse().setPushableBoxes(-1);
        System.out.println("<-");
    }

    @Override
    public void stepOnIt(Player player) {
        System.out.println("->[Hole: h].stepOnIt(worker)");
        removeElement(player);
        player.die();
        System.out.println("<-");
    }
}
