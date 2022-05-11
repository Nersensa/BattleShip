package com.company.BattleShip;

public class Cell {

    private final int x;
    private final int y;
    private FieldState state;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        state = FieldState.EMPTY;
    }

    public String toString() {
        return state.toString();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public FieldState getState() {
        return state;
    }

    public void setState(FieldState state) {
        this.state = state;
    }
}
