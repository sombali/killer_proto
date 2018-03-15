package com.model;

import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private int pushableBoxes;
    private List<Field> fields;
    private List<Player> playerList= new ArrayList<>();

    public void initialize() {
        this.fields = new ArrayList<>();
        Field playerField = new Field();
        createPlayer();
        playerField.setElement(playerList.get(0));
        this.fields.add(playerField);
        playerList.get(0).setField(playerField);
    }

    public void addField(Field field) {
        this.fields.add(field);
    }

    public void createPlayer() {
        playerList.add(new Worker());
    }

    public void removePlayer() {

    }

    public void setPushableBoxes(int num) {

    }

    public List<Player> getPlayerList() {
        return playerList;
    }
}
