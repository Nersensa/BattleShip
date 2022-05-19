package com.company.BattleShip;

import java.util.ArrayList;
import java.util.List;

public class Player {

    String name;
    Battlefield field;
    List<Ship> ships;

    public Player(String name) {
        this.name = name;
        field = new Battlefield();
        InitialiseShips();
    }

    public void InitialiseShips() {
        ships = new ArrayList<>();

        ships.add(new Ship(field, 4,4));
    }

    public void AddShip() {
        String[] line = {"0", "1", "0", "2"};
        for (int i = 0; i < line.length - 2; i++) {
        }

    }

    public boolean isAvailableForShip(int x, int y) {
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i <= 9 && j >= 0 && j <= 9) {
                    if (field.getCell(i, j).getState() != FieldState.EMPTY && field.getCell(i, j).getState() != FieldState.AUREOLE)
                        return false;
                }
            }
        }
        return true;
    }





    public void setField(Battlefield field) {
        this.field = field;
    }

    public Battlefield getField() {
        return field;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void addShip(Ship ship) {
        this.ships.add(ship);
    }
}
