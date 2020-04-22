package com.company;

import java.util.ArrayList;

public class House {
    static ArrayList <Room> listOfRooms = new ArrayList<Room>();
    String address;


    private House(String address) {
        this.listOfRooms = listOfRooms;
    }

    public static House createHouse(String address){
        return new House(address);
    }

    public static void addRoom(Room room){
        listOfRooms.add(room);

    }
    public static void addRoom(ArrayList<Room>rooms){
        listOfRooms.addAll(rooms);
    }

    public static int getRoomCount(){
        return listOfRooms.size();
    }


}
