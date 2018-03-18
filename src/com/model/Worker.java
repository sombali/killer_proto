package com.model;

/**
 * A Worker típusú játékosok metódusait foglalja magában ez az osztály.
 */
public class Worker extends Player {

    /**
     *
     * @param direction Egy paraméterül átvett irány,amelyikbe lépni kíván a Worker.
     * A függvény felelős a Worker megfelelő irányba történő léptetéséért.
     * Megnézi, hogy melyik a követekző mező és azon áll e valamilyen element és ennek függvényében
     * hajtja végre a mozgást.
     */
    @Override
    public void move(Direction direction) {

        super.move(direction);
        //ez hivodik meg , itt hivom meg a metodusokat nezzetek a szekvenciakat , az fog segiteni.

        Field nextfield =  getField().getNeighbors(direction);
        Element nextElement = nextfield.getElement();

        //Ez se fog majd kelleni de most KELL
        nextfield.setElement(nextElement);
        if(nextElement != null) {
            nextElement.setTestField(nextfield);
        }

        boolean allow;
        if(nextElement != null) {
            allow =  nextElement.hit(this, Direction.FIRST);
            if(allow==true){
                step(nextfield);
            }
        } else {
            step(nextfield);
        }


    }
}
