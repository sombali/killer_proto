package com.model;

import java.util.Scanner;

public class Field {
    private Element element;
    Direction direction;
    private Field[] neighbors;

    //Itt adom meg hogy mi van a szomszedos mezon , egyszeru if else (meg nincs kesz)
    public Element getElement() {
        Scanner in = new Scanner(System.in);
        System.out.println("Mi van a szomszedos mezon? 1-Fal , 2-Doboz ,3-Semmi");
        int x= in.nextInt();

        if(x==1) {
            System.out.println("-->[Field f2].getElement()");
            System.out.println("<--[Wall :w]");
            return new Wall();

        }
        else if(x==2) {
            System.out.println("-->[Field: f2].getElement()");
            System.out.println("<--[Box: b]");
            return new Box();
        }
        else if(x==3) {
            return null;
        }
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Field() {

    }

    public void acceptElement(Element element) {

    }

    public void removeElement(Element element) {

    }

    //itt adjuk meg milyen szomszedos mezo van
    public Field getNeighbors(Direction direction) {
        Scanner infield= new Scanner(System.in);
        System.out.println("Milyen mezore lepsz: 1-Sima , 2-Hole?");
        int pelda=infield.nextInt();
        if(pelda==1) {
            System.out.println("[Field :f1].getNeighbour()");
            System.out.println("<--[Field :f2]");
            return new Field();
        }
        if(pelda==2)
            return new Hole();
        else
            return new Field();
    }

    public void setNeighbors(Direction direction, Field field) {

    }

    public void stepOnIt(Element element) {

    }

    public void stepOnIt(Pushable pushable) {

    }

    public void stepOnIt(Player player) {

    }
}
