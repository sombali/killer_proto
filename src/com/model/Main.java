package com.model;

import java.util.Scanner;

public class Main {

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
        System.out.println("Jatek Lepeget - Press 1 and Enter ");
        System.out.println("Jatek Feladasa - Press 2 and Enter");
        System.out.println("Jatek Nyerese - Press 3 and Enter");
        int x = in.nextInt();
        //egy eset egyelore csak hogy lassatok hogyan mukodik
        if(x==1)
            //testPlayer.move(Direction.FIRST);
            game.getWarehouse().getPlayerList().get(0).move(Direction.FIRST);
    }



}
