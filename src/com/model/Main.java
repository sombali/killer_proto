package com.model;

import java.util.Scanner;

/**
 * A Main osztály a main metódus megvalósításáért felelős.
 */
public class Main {
    /**
     *
     * @param args
     * A program main függvénye, itt történnek a játék során létrejövő objektumok példányosításai, függvényhívásai,
     * illetve egyéb műveletei.
     */
    public static void main(String[] args) {
        //Ez csak egy vazlat majd szepitgetjuk.
        //Field pelda=new Field();//Letrehozom a kezdo mezot amin van a munkas
        //Worker testPlayer = new Worker(); //Letrehozok egy munkast.
        //testPlayer.setField(pelda); //Beallitom azt a mezot amin MOST van a munkas = egy sima mezore
        //pelda.setElement(testPlayer);//es Beallitom a field elemntjet a munkasra


        Game game = new Game();
        game.startGame();
        //Egyszeru menu
        Scanner in = new Scanner(System.in); //Csak beolvas
        System.out.println("Jatek Lepeget - Irj 1-et, majd nyomj egy Entert");
        System.out.println("Jatek Feladasa - Irj 2-ot, majd nyomj egy Entert");
        System.out.println("Jatek Megnyerese - Irj 3-at, majd nyomj egy Entert");
        int x = in.nextInt();
        Player testPlayer = game.getWarehouse().getPlayerList().get(0);
        //egy eset egyelore csak hogy lassatok hogyan mukodik
        if(x==1) {
            //testPlayer.move(Direction.FIRST);
            testPlayer.move(Direction.FIRST);
        } else if(x == 2) {
            testPlayer.surrender();
        } else if(x == 3) {
            testPlayer.win();
        }
    }



}
