package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Furniture f1 = new Furniture(10,"Shelf");
        Furniture f2 = new Furniture(20, "Table");

        ArrayList<Furniture>fur = new ArrayList<Furniture>();
        fur.add(f1);
        fur.add(f2);

        Room diningRoom = new Room(fur, 20);
        Room kitchen = new Room(fur, 10);
        Room saloon = new Room(fur, 40);


        System.out.println(diningRoom.getPriceOfFurniture());

        House.createHouse("ExampleAddress");
        House.addRoom(diningRoom);

        ArrayList<Room> rooms= new ArrayList<>();
        rooms.add(kitchen);
        rooms.add(saloon);

        House.addRoom(rooms);

        System.out.println(House.getRoomCount());










    }
}
