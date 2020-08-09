package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Add 5L water in bottle1:");
        int bottle1 = input.nextInt();
        System.out.println("Add water in bottle2:");
        int bottle2 = input.nextInt();

        int max = 8;

       /* if (bottle1 > max && bottle2 > max) {
            System.out.println("fail");
              if (bottle1 == bottle2)
              { System.out.println("Wrong result");} */

            int container1 = bottle1; // Bottle which contains 5L water
            int container2 = bottle2; // Bottle which contains 3L water

           // int result;

            container1 = container1 - container2;
            System.out.println("Bottle2 has " + container2 + " water in it");
            System.out.println("Bottle1 has " + container1 + " water in it");
            container2 = container2 - container2;
            System.out.println("Bottle2 has " + container2 + " water in it");
            container1 = container1 - container2;
            System.out.println("Bottle1 has " + container1 + " water in it");
            container1 = container1 - container1;
            System.out.println("Bottle1 has " + container1 + " water in it");
            System.out.println("Add 5L water in bottle1:");
            container1 = container1 + input.nextInt();
            System.out.println("Pour 1L water from Bottle1 to Bottle2");
            container1 = container1 - input.nextInt();
            System.out.println(container1);

        }

    }























