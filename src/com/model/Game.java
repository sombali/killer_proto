package com.model;

/**
 * A játékot kezelő osztály
 *
 * Elindítja és befejezi a játékot, inicializálja a pályát. A játéknak vége van,
 * ha egy játékos minden kijelölt mezőjére ládát tolt, vagy ha elfogytak a tolható ládák.
 */
public class Game
{
    /**
     * A játék pályája
     */
    Warehouse warehouse = new Warehouse();

    /**
     * Elindítja a játékot
     */
    public void startGame() {
        warehouse.initialize();
    }

    /**
     * Befejezi a játékot
     */
    public void endGame() {

    }

    /**
     * Megadja a játék pályáját
     * @return játék pályája
     */
    public Warehouse getWarehouse() {
        return warehouse;
    }
}

