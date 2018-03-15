package com.model;



public class Worker extends Player {

    @Override
    public void move(Direction direction) {

        super.move(direction);
        //ez hivodik meg , itt hivom meg a metodusokat nezzetek a szekvenciakat , az fog segiteni.
        Field nextfield =   field.getNeighbors(Direction.FIRST);
        Element element = nextfield.getElement();
        //Mivel nem taroljuk onmagunkat sehol ezert mindig mikor atadjuk magunkat paramterbe
        //letre kell hozzunk mindig egy peldanyt :(
        Worker myself = new Worker();
        //annak az elementnek a hit fuggvenyet hivjuk meg ami a szomszedos mezon van , parameterul pedig magunkat adjuk at
        boolean allow;
        if(element != null) {
          allow =  element.hit(myself, Direction.FIRST);

        }
    }

    @Override
    public void step(Field nextfield)
    {
        Worker me = new Worker();
        field.removeElement(me);
        nextfield.acceptElement(me);
        me.setField(nextfield);
        nextfield.stepOnIt(me);
    }
}
