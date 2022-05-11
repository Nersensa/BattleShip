package com.company.BattleShip;

public enum FieldState {
    EMPTY("| |"), SHIP4("|0|"), AUREOLE("| |"), MISS("|*|"), HIT("|X|"),
    SHIP3_1("|0|"), SHIP3_2("|0|"), SHIP2_1("|0|"), SHIP2_2("|0|"), SHIP2_3("|0|"),
    SHIP1_1("|0|"), SHIP1_2("|0|"), SHIP1_3("|0|"), SHIP1_4("|0|");

    private String icon;

    FieldState(String icon) {
        this.icon = icon;
    }

    public String toString() {
        return this.icon;
    }
}
