package com.uoc;

import java.util.ArrayList;
import java.util.Scanner;

public class vehicle {

    // array list for store data and input the details of driver and vehicle details

    //standard park
    public boolean database1() {

        ArrayList<String> name1 = new ArrayList<String>();
        ArrayList<String> vehicle1 = new ArrayList<String>();
        ArrayList<Integer> uni_id1 = new ArrayList<Integer>();
        ArrayList<Integer> phone1 = new ArrayList<Integer>();

        ArrayList<String> name2 = new ArrayList<String>();
        ArrayList<String> vehicle2 = new ArrayList<String>();
        ArrayList<Integer> uni_id2 = new ArrayList<Integer>();
        ArrayList<Integer> phone2 = new ArrayList<Integer>();

        ArrayList<String> name3 = new ArrayList<String>();
        ArrayList<String> vehicle3 = new ArrayList<String>();
        ArrayList<Integer> uni_id3 = new ArrayList<Integer>();
        ArrayList<Integer> phone3 = new ArrayList<Integer>();

        Scanner park_type = new Scanner(System.in);
        int type = park_type.nextInt();
        switch (type){
        case 1:
            boolean n = true;
            while (n) {
                if (vehicle1.size() <= 14) {
                    int k;
                    k = vehicle1.size();
                    System.out.println((15 - k) + "-vacancies available in the park");

                    System.out.println("Enter your name:");
                    Scanner Name1 = new Scanner(System.in);
                    String name11 = Name1.nextLine();

                    System.out.println("Enter your vehicle number:");
                    Scanner Vehicle_no1 = new Scanner(System.in);
                    String vehicle_no11 = Vehicle_no1.nextLine();

                    System.out.println("Enter your university ID:");
                    Scanner University_id1 = new Scanner(System.in);
                    int university_id11 = University_id1.nextInt();

                    System.out.println("Enter your phone number:");
                    Scanner Phone_no1 = new Scanner(System.in);
                    int phone_no11 = Phone_no1.nextInt();

                    name1.add(name11);
                    vehicle1.add(vehicle_no11);
                    uni_id1.add(university_id11);
                    phone1.add(phone_no11);

                } else {
                    System.out.println("....Sorry!....There is no vacancies in the standard park");
                    n = false;
                }
                }
        case 2:
            boolean m = true;
            while (m) {
                if (vehicle1.size() <= 4) {
                    int v;
                    v = vehicle1.size();
                    System.out.println((5 - v) + "-vacancies available in the park");

                    System.out.println("Enter your name:");
                    Scanner Name2 = new Scanner(System.in);
                    String name22 = Name2.nextLine();

                    System.out.println("Enter your vehicle number:");
                    Scanner Vehicle_no2 = new Scanner(System.in);
                    String vehicle_no22 = Vehicle_no2.nextLine();

                    System.out.println("Enter your university ID:");
                    Scanner University_id2 = new Scanner(System.in);
                    int university_id22 = University_id2.nextInt();

                    System.out.println("Enter your phone number:");
                    Scanner Phone_no2 = new Scanner(System.in);
                    int phone_no22 = Phone_no2.nextInt();

                    name1.add(name22);
                    vehicle1.add(vehicle_no22);
                    uni_id1.add(university_id22);
                    phone1.add(phone_no22);

                } else {
                    System.out.println("....Sorry!....There is no vacancies in the handicapped park");
                    n = false;
                }
            }
            boolean p = true;
            while (p) {
                if (vehicle1.size() <= 9) {
                    int u;
                    u = vehicle1.size();
                    System.out.println((10 - u) +"-vacancies available in the park");

                    System.out.println("Enter your name:");
                    Scanner Name3 = new Scanner(System.in);
                    String name33 = Name3.nextLine();

                    System.out.println("Enter your vehicle number:");
                    Scanner Vehicle_no3 = new Scanner(System.in);
                    String vehicle_no33 = Vehicle_no3.nextLine();

                    System.out.println("Enter your university ID:");
                    Scanner University_id3 = new Scanner(System.in);
                    int university_id33 = University_id3.nextInt();

                    System.out.println("Enter your phone number:");
                    Scanner Phone_no3 = new Scanner(System.in);
                    int phone_no33 = Phone_no3.nextInt();

                    name1.add(name33);
                    vehicle1.add(vehicle_no33);
                    uni_id1.add(university_id33);
                    phone1.add(phone_no33);

                } else {
                    System.out.println("....Sorry!....There is no vacancies in the long vehicles' park");
                    n = false;
                }
            }
        }
        return true;
        }
}

