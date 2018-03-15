package com.model;

public class Game
{
    Warehouse warehouse = new Warehouse();

    public void startGame() {
        warehouse.initialize();
    }

    public void endGame() {

    }

    public Warehouse getWarehouse() {
        return warehouse;
    }
}

