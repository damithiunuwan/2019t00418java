package com.uoc;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============WELCOME=============\n PARKING MANAGEMENT SYSTEM OF UOC");
        System.out.println("1.Enter the park");
        System.out.println("2.exit the park \n ....enter your selection(1 or 2)....");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        park_slot available = new park_slot();
        park_slot park_slot1=new park_slot();
        park_slot park_slot2=new park_slot();
        park_slot park_slot3=new park_slot();

        switch (input) {
            case (1):
                System.out.println("Enter your park type:\n 1.standard park(Light vehicles and Bicycles)\n 2.Handicapped park\n 3.Long vehicle park");
                System.out.println("....enter your selection(1,2 or 3)....");


                available.indicator();
                break;

            case (2):
                System.out.println("Type of your park:\n1.Standard park(light vehicles and bicycles)\n2.Handicapped park\n3.Long vehicle park");

                Scanner Type = new Scanner(System.in);
                int Input = Type.nextInt();

                if (Input == 1) {
                    park_slot1.slot1_exit();
                } else if (Input == 2) {
                    park_slot1.slot2_exit();
                } else {
                    park_slot1.slot3_exit();
                }

                System.out.println("====Thank You!====");
                System.out.println("Have a good journey");
        }

    }
}




