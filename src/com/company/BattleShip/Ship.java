package com.company.BattleShip;

import java.util.Arrays;

public class Ship {

    Cell[] shipCells;

    public Ship(Battlefield battlefield, int x1, int y1) {
        shipCells = new Cell[1];
        shipCells[0] = battlefield.getCell(x1, y1);
    }

    public Ship(Battlefield battlefield, int x1, int y1, int x2, int y2) {
        shipCells = new Cell[2];
        shipCells[0] = battlefield.getCell(x1, y1);
        shipCells[1] = battlefield.getCell(x2, y2);
    }

    public Ship(Battlefield battlefield, int x1, int y1, int x2, int y2, int x3, int y3) {
        shipCells = new Cell[3];
        shipCells[0] = battlefield.getCell(x1, y1);
        shipCells[1] = battlefield.getCell(x2, y2);
        shipCells[2] = battlefield.getCell(x3, y3);
    }

    public Ship(Battlefield battlefield, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        shipCells = new Cell[4];
        shipCells[0] = battlefield.getCell(x1, y1);
        shipCells[1] = battlefield.getCell(x2, y2);
        shipCells[2] = battlefield.getCell(x3, y3);
        shipCells[3] = battlefield.getCell(x4, y4);
    }

    public boolean IsDead() {
        for (Cell cell: shipCells) {
            if (cell.getState() == FieldState.SHIP)
                return false;
        }
        return true;
    }

    public String toString() {
        return "Ship: {" + Arrays.toString(shipCells) + "}";
    }
}
