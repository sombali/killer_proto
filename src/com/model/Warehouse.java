package com.model;



import java.util.ArrayList;
import java.util.List;

/**
 * A játékban magát a pályát képviseli, annak tulajdonságaival, illetve metódusaival.
 *
 */
public class Warehouse {

    /**
     * A játékban szereplő, még tolható ládák száma.
     */
    private int pushableBoxes = 10;

    /**
     * A pályán található mezőket tárolja(Field,Switch,TrapDoor,Wall vagy Hole)
     */
    private List<Field> fields;

    /**
     * A játékosokat tároló lista.
     */
    private List<Player> playerList;

    /**
     * Létrehozza a pályán lévő mezőket, játékosokat, tulajdonképpen előkészíti a játék kezdetét.
     */
    public void initialize() {
        System.out.println("Munkas beallitasa elso mezore: ");
        this.fields = new ArrayList<>();
        this.playerList = new ArrayList<>();
        Field playerField = new Field();
        createPlayer();
        createPlayer();
        playerField.setElement(playerList.get(0));
        this.fields.add(playerField);
        playerList.get(0).setField(playerField);
    }

    /**
     * Hozzáadja az átvett objektumot a mezőket tartalmazó listához.
     * @param field Field típusú objektum
     *             
     */
    public void addField(Field field) {
        this.fields.add(field);
    }

    public int getPushableBoxes() {
        return pushableBoxes;
    }

    /**
     * A metódus létrehoz egy új Workert, akit egyből hozzá is ad a játékosokat tartalmazó listához.
     */
    public void createPlayer() {
        playerList.add(new Worker());
    }

    /**
     * Eltávolítja a játékost a pályáról
     * @param player játékos
     */
    public void removePlayer(Player player) { playerList.remove(player);}

    /**
     * A metódus fő célja, hogy a még tolható ládák számát folyamtosan állítani tudja,
     * hiszen ha már ez a szám 0 akkor vége a játéknak.
     * @param num Egy integer, ami a még tolható ládák számát adja meg.
     *           
     */
    public void setPushableBoxes(int num) {
        System.out.println("-->[Warehouse].setPushableBoxes(num)");
        pushableBoxes -= num;
        System.out.println("<--");
    }

    /**
     * Megadja a játékosok listáját
     * @return játékosokat tartalmazó lista
     */
    public List<Player> getPlayerList() {
        return playerList;
    }
}
