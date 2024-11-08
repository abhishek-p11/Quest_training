package com.quest.practice_vars;
public class ControlFlow {
    public static void main(String[] args) {
        int number = 10;
        if (number < 0) {
            System.out.println("Number is negative");
        } else if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is zero");
        }
        String day = "monday";
        switch (day) {
            case "monday":
                System.out.println("Monday");
                break;
            case "tuesday":
                System.out.println("Tuesday");
                break;
            case "wednesday":
                System.out.println("Wednesday");
                break;
            case "thursday":
                System.out.println("Thursday");
                break;
            case "friday":
                System.out.println("Friday");
                break;
            case "saturday":
                System.out.println("Saturday");
                break;
            case "sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        testForLoop();
//        testWhileLoop();
    }

    private static void testForLoop() {
        for (int i = 0; i < 21; i++) {
            if (i % 2 != 0) {
                continue;
            } else {
                System.out.println("Even number" + i);
            }
//            System.out.println(i);
        }
    }

    private static void testWhileLoop() {
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}



