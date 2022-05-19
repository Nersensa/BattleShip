package com.company.BattleShip;

public enum FieldState {
    EMPTY("| |"), SHIP("|0|"), AUREOLE("| |"), MISS("|*|"), HIT("|X|");

    private String icon;

    FieldState(String icon) {
        this.icon = icon;
    }

    public String toString() {
        return this.icon;
    }
}
