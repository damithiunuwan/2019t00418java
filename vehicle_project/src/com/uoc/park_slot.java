package com.uoc;

import java.util.ArrayList;

public class park_slot {       // parking slots with unique id,GPS coordinates and indicator(availability)
    String id;
    String GPS_enter;
    String GPS_exit;


    //standard park
    public boolean slot1_enter() {
        System.out.println("slot_ID-A01\nthis is your destination - 41°24’12.2″N  2°10’26.5″E...Go straight and turn left to enter the park");
        return true;
    }
    public boolean slot1_exit(){
        System.out.println("this is your destination - 32°14’12.2″N  1°13’26.5″E...Turn left to exit the park ");
        return true;
    }
    vehicle data1=new vehicle();
    public boolean indicator() {
            data1.database1();
        return true;
    }
    //handicapped park
    public boolean slot2_enter(){
        System.out.println("slot_ID-A02\nthis is your destination - 21°24’42.2″N  12°10’26.5″E...Go straight and turn right to enter the park");
        return true;
    }
    public boolean slot2_exit(){
        System.out.println("this is your destination - 11°24’32.2″N   8°17’26.5″E...Turn right to exit the park");
        return true;
    }
    //long vehicle park
    public void slot3_enter(){
        GPS_enter="slot_ID-A03\nthis is your destination - 11°24’32.2″N   2°17’26.8″E...Go straight turn left and turn right to enter the park";
    }
    public void slot3_exit(){
        GPS_exit="this is your destination - 1°24’32.2″N   2°10’26.5″E...Turn right to exit the park";
    }

}
