package com.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Field {
    private Element element;
    Direction direction;
    private Map<Direction, Field> fieldMap = new HashMap<>();
    private Warehouse warehouse;


    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    //Itt adom meg hogy mi van a szomszedos mezon , egyszeru if else (meg nincs kesz)
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

    public void setElement(Element element) {
        this.element = element;
    }

    public Field() {

    }

    //@Bazsi voltam szotyola van fiukaaak
    public void acceptElement(Element element) {
        System.out.println("-->[Field :f2].acceptElement(element)");
        element.setField(this);
        System.out.println("<-----");
        setElement(element);
    }

//    public void removeElement(Element element) {
//        System.out.println("-->[Field :f1].removeElement(player)");
//    }

    public void removeElement(Player player) {
        System.out.println("-->[Field :f1].removeElement(worker)");
    }

    public void removeElement(Pushable pushable) {
        System.out.println("-->[Field :f1].removeElement(box)");
    }



    //itt adjuk meg milyen szomszedos mezo van
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

    public void setNeighbors(Direction direction, Field field) {

    }

    public void stepOnIt(Element element) {
            System.out.println("-->[Field :f2].stepOnIt(element)");
            System.out.println("<----");
    }

    public void stepOnIt(Pushable pushable) {
        System.out.println("-->[Field :f2].stepOnIt(box)");
        System.out.println("<----");
    }

    public void stepOnIt(Player player) {
        System.out.println("-->[Field :f2].stepOnIt(worker)");
        System.out.println("<----");
    }



}
