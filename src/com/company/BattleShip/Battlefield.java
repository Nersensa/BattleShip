package com.company.BattleShip;

public class Battlefield {

    private Cell[][] cells;

    public Battlefield() {

        cells = new Cell[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }



    public void addShip(int x, int y, FieldState state) {
        if (isAvailableForShip(x, y)) {
            setCell(x, y, state);
            aureole(x, y, state);
        } else throw new IllegalArgumentException();
    }

    public void addShip(int x1, int y1, int x2, int y2, FieldState state) {
        if (isAvailableForShip(x1, y1) && isAvailableForShip(x2, y2)) {
            setCell(x1, y1, state);
            setCell(x2, y2, state);
            aureole(x1, y1, state);
            aureole(x2, y2, state);
        } else throw new IllegalArgumentException();
    }

    public void addShip(int x1, int y1, int x2, int y2, int x3, int y3, FieldState state) {
        if (isAvailableForShip(x1, y1) && isAvailableForShip(x2, y2) && isAvailableForShip(x3, y3)) {
            setCell(x1, y1, state);
            setCell(x2, y2, state);
            setCell(x3, y3, state);
            aureole(x1, y1, state);
            aureole(x2, y2, state);
            aureole(x3, y3, state);
        } else throw new IllegalArgumentException();
    }

    public void addShip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, FieldState state) {
        if (isAvailableForShip(x1, y1) && isAvailableForShip(x2, y2) && isAvailableForShip(x3, y3) && isAvailableForShip(x4, y4)) {
            setCell(x1, y1, state);
            setCell(x2, y2, state);
            setCell(x3, y3, state);
            setCell(x4, y4, state);
            aureole(x1, y1, state);
            aureole(x2, y2, state);
            aureole(x3, y3, state);
            aureole(x4, y4, state);
        } else throw new IllegalArgumentException();
    }

    public void aureole(int x, int y, FieldState state) {
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i <= 9 && j >= 0 && j <= 9) {
                    if (state != cells[i][j].getState()) {
                        cells[i][j].setState(FieldState.AUREOLE);
                    }
                }
            }
        }
    }

    public void Print() {

        System.out.println("x\\y |0| |1| |2| |3| |4| |5| |6| |7| |8| |9|");
        for (int i = 0; i < 10; i++) {
            System.out.print("|" + i + "| ");
            for (int j = 0; j < 10; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Cell getCell(int x, int y) {
        return this.cells[x][y];
    }

    public void setCell(int x, int y, FieldState state) {
        this.cells[x][y].setState(state);
    }
}
