package com.model;


public class Worker extends Player {

    @Override
    public void move(Direction direction) {

        super.move(direction);
        //ez hivodik meg , itt hivom meg a metodusokat nezzetek a szekvenciakat , az fog segiteni.
        //Field nextfield =   field.getNeighbors(Direction.FIRST);
        Field nextfield =   getField().getNeighbors(direction); //parameterbne ugyis atadjuk, ez nem eleg? @Bazsi
        Element nextElement = nextfield.getElement();
        //Mivel nem taroljuk onmagunkat sehol ezert mindig mikor atadjuk magunkat paramterbe
        //letre kell hozzunk mindig egy peldanyt :(
        //Worker myself = new Worker();
        //annak az elementnek a hit fuggvenyet hivjuk meg ami a szomszedos mezon van , parameterul pedig magunkat adjuk at
        boolean allow;
        if(nextElement != null) {
            //allow =  nextElement.hit(myself, Direction.FIRST);
            allow =  nextElement.hit(this, Direction.FIRST); //szerintem a this mukodik, nem kell uj worker @Bazsi
        } else {
            step(nextfield);
        }
    }

    //ezt atraktam a Playerbe, szebbnek talalom ugy, de lehet tevedek @Bazsi
    @Override
    public void step(Field nextField)
    {
        //Worker me = new Worker();
//        field.removeElement(this);
//        nextField.acceptElement(this);
//        this.setField(nextField);
//        nextField.stepOnIt(this);
    }
}
