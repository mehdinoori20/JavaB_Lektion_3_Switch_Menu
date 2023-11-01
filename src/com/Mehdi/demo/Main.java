package com.Mehdi.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TODO - Check why this doesn't work VS switch Scanners!
        System.out.println("Step #1 INT");
        sc.nextInt();
        System.out.println("Step #2");
        sc.nextLine();
        System.out.println("Step #3 INT");
        sc.nextInt();
        System.out.println("Step #4");
        sc.nextLine();
        System.out.println("DONE");

        System.out.println("1. weekdaySwitch 2. scoreSwitch 0. to EXIT");
        do {
            System.out.println("----You're in main menu now!----");
            switch (sc.nextLine()) {
                case "1" -> weekdaySwitch();
                case "2" -> scoreSwitch();
                case "0" -> System.exit(0);
            }
        } while (true);

    }

    public static void weekdaySwitch() {

        Scanner sc = new Scanner(System.in);
        System.out.println("What day of the week do you want?");
        switch (sc.nextLine()) {
            case "1" -> System.out.println("Monday");
            case "2" -> System.out.println("Tuesday");
            case "3" -> System.out.println("Wednesday");
            case "4" -> System.out.println("Thursday");
            case "5" -> System.out.println("Friday");
            // case 5,6,7,8 -> System.out.println("Friday");

            default -> {
                System.out.println("Weekend");
                System.out.println("And some extra text");
            }
        }

    }

    public static void scoreSwitch() {

        // Section #2
        // Return example
        Scanner sc = new Scanner(System.in);
        System.out.println("Add 1. score or 2.");

        int score = switch (sc.nextInt()) {
            case 1 -> {
                System.out.println("You pressed 1 ");

                yield 1;
            }
            case 2 -> {
                System.out.println("You pressed 2");

                yield 2;
            }

            default -> 0;
        };

        System.out.println(score);

    }


}