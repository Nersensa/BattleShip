package com.company.BattleShip;

public class Main {

    public static void main(String[] args) {

        Battlefield field1 = new Battlefield();
        initialiseShips(field1);
        field1.Print();

    }

    public static void initialiseShips(Battlefield battlefield) {

        System.out.println("Input ship1_1:");
        battlefield.addShip(4, 0, FieldState.SHIP1_1);

        System.out.println("Input ship1_2:");
        battlefield.addShip(2, 7, FieldState.SHIP1_1);

        System.out.println("Input ship1_3:");
        battlefield.addShip(9, 4, FieldState.SHIP1_2);

        System.out.println("Input ship1_4:");
        battlefield.addShip(8, 9, FieldState.SHIP1_1);


        System.out.println("Input ship2_1:");
        battlefield.addShip(1, 0, 2, 0, FieldState.SHIP1_1);

        System.out.println("Input ship2_2:");
        battlefield.addShip(2, 2, 2, 3, FieldState.SHIP1_1);

        System.out.println("Input ship2_3:");
        battlefield.addShip(9, 6, 8, 6, FieldState.SHIP1_1);


        System.out.println("Input ship3_1:");
        battlefield.addShip(9, 2, 8, 2, 7, 2, FieldState.SHIP1_1);

        System.out.println("Input ship3_2:");
        battlefield.addShip(4, 5, 4, 6, 4, 7, FieldState.SHIP1_1);


        System.out.println("Input ship4_1:");
        battlefield.addShip(0, 4, 0, 5, 0, 6, 0, 7, FieldState.SHIP1_1);
    }
}
