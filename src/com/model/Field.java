package com.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * A pályán lévő mezőket reprezentáló osztály
 *
 * A mező ismeri szomszédos mezőit négy irányban, a rajta álló elemet.
 */
public class Field {

    /**
     * A mezőn álló elem
     */
    private Element element;

    /**
     * Egy szomszédo mező iránya
     */
    Direction direction;

    /**
     * A szomszédos mezők, irány szerint tárolva
     */
    private Map<Direction, Field> fieldMap = new HashMap<>();

    /**
     * A mezőt tartalmazó pálya
     */
    private Warehouse warehouse;

    /**
     * Beállítja a kívánt pályát a mezőnek
     * @param warehouse a mezőt tartalmazó pálya
     */
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * Megadja a mezőhöz tartozó pályát
     * @return mezőhöz tartozó pálya
     */
    public Warehouse getWarehouse() {
        return warehouse;
    }

    /**
     * Megadja a mezőn jelenleg álló elemet
     * @return mezőn álló elem
     */
    public Element getElement() {
        Scanner in = new Scanner(System.in);
        System.out.println("Mi van a szomszedos mezon? 1-Fal, 2-Doboz, 3-Oszlop, 4-Semmi, 5-Munkas");
        int x= in.nextInt();
        System.out.println("-->[Field :f2].getElement()");
        if(x==1) {
            System.out.println("<--[Wall :w]");
            return new Wall();
        }
        else if(x==2) {
            System.out.println("<--[Box :b]");
            return new Box();
        }
        else if(x==3){
            System.out.println("<--[Column :c]");
            return new Column();
        }
        else if(x==4) {
            return null;
        }
        else if(x==5){
            System.out.println("<--[Worker :w]");
            return new Worker();

        }
        return null;
    }

    /**
     * Beállítja a hozzátartozó elemet
     * @param element a hozzátartozó elem
     */
    public void setElement(Element element) {
        this.element = element;
    }

    public Field() {

    }

    /**
     * A mezőre elem lép, beállítja a saját elemének, az elem mezőjének pedig beállítja saját magát
     * @param element a mezőre lépni kívánó elem
     */
    public void acceptElement(Element element) {
        System.out.println("-->[Field :f2].acceptElement(element)");
        element.setField(this);
        System.out.println("<-----");
        setElement(element);
    }

//    public void removeElement(Element element) {
//        System.out.println("-->[Field :f1].removeElement(player)");
//    }

    /**
     * Eltávolítja magáról a rajta álló játékost
     * @param player a mezőn álló játékos
     */
    public void removeElement(Player player) {
        System.out.println("-->[Field :f1].removeElement(worker)");
    }

    /**
     * Eltávolítja a rajta álló tolható elemet
     * @param pushable a mezőn álló tolható objektum
     */
    public void removeElement(Pushable pushable) {
        System.out.println("-->[Field :f1].removeElement(box)");
    }


    /**
     * Megadja a szomszédos mezőket a kívánt irányban
     * @param direction a kívánt irány
     * @return szomszédos mező
     */
    public Field getNeighbors(Direction direction) {
        Scanner infield = new Scanner(System.in);
        System.out.println("Milyen mezore lepsz: 1-Sima , 2-Hole, 3-TrapDoor, 4-Switch, 5-TargetField?");
        int pelda = infield.nextInt();
        System.out.println("-->[Field :f1].getNeighbour()");
        if(pelda==1) {
            fieldMap.put(direction, new Field());
            System.out.println("<--[Field :f2]");
            return fieldMap.get(direction);
        }
        else if(pelda==2) {
            fieldMap.put(direction, new Hole());
            System.out.println("<--[Hole :h]");
            return fieldMap.get(direction);
        }
        else if(pelda == 3) {
            fieldMap.put(direction, new TrapDoor());
            System.out.println("<--[TrapDoor :td]");
            return fieldMap.get(direction);
        }
        //@Ákos
        if(pelda==4) {
            fieldMap.put(direction, new Switch());
            System.out.println("<--[Switch :sw]");
            return fieldMap.get(direction);
        }
        else if(pelda==5){
            fieldMap.put(direction, new TargetField());
            System.out.println("<--[TargetField: tf]");
            return fieldMap.get(direction);
        }
        else
            fieldMap.put(direction, new Field());
            return fieldMap.get(direction);
    }

    /**
     * Beállítja a szomszédos mezőket a kívánt irányban
     * @param direction a szomszédos mező iránya
     * @param field a szomszédos mező
     */
    public void setNeighbors(Direction direction, Field field) {

    }

    /**
     * A mezőre elem lépett
     * @param element a mezőre lépett elem
     */
    public void stepOnIt(Element element) {
            System.out.println("-->[Field :f2].stepOnIt(element)");
            System.out.println("<----");
    }

    /**
     * A mezőre tolható elem lépett
     * @param pushable a mezőre lépett tolható elem
     */
    public void stepOnIt(Pushable pushable) {
        System.out.println("-->[Field :f2].stepOnIt(box)");
        System.out.println("<----");
    }

    /**
     * A mezőre játékos lépett
     * @param player a mezőre lépett játékos
     */
    public void stepOnIt(Player player) {
        System.out.println("-->[Field :f2].stepOnIt(worker)");
        System.out.println("<----");
    }



}
