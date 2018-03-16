package com.model;

import com.sun.org.apache.xpath.internal.SourceTree;

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

    //@Bazsi voltam szotyola van fiukaaak
    public void acceptElement(Element element) {
        System.out.println("-->[Field :f2].acceptElement(player)");
        element.setField(this);
        System.out.println("<-----");
        setElement(element);
    }

//    public void removeElement(Element element) {
//        System.out.println("-->[Field :f1].removeElement(player)");
//    }

    public void removeElement(Player player) {
        System.out.println("-->[Field :f1].removeElement(player)");
    }

    public void removeElement(Pushable pushable) {
        System.out.println("-->[Field :f1].removeElement(pushable)");
    }



    //itt adjuk meg milyen szomszedos mezo van
    public Field getNeighbors(Direction direction) {
        Scanner infield = new Scanner(System.in);
        System.out.println("Milyen mezore lepsz: 1-Sima , 2-Hole, 3-TrapDoor?");
        int pelda = infield.nextInt();
        System.out.println("-->[Field :f1].getNeighbour()");
        System.out.println("<--[Field :f2]");
        if(pelda==1) {
            return new Field();
        }
        if(pelda==2)
            return new Hole();
        else if(pelda == 3) {
            System.out.println();
            return new TrapDoor();
        }
        else
            return new Field();
    }

    public void setNeighbors(Direction direction, Field field) {

    }

    public void stepOnIt(Element element) {
            System.out.println("-->[Field f2].stepOnIt(e)");
            System.out.println("<----");
    }

    public void stepOnIt(Pushable pushable) {
        System.out.println("-->[Field f2].stepOnIt(e)");
        System.out.println("<----");
    }

    public void stepOnIt(Player player) {
        System.out.println("-->[Field f2].stepOnIt(e)");
        System.out.println("<----");
    }
}
