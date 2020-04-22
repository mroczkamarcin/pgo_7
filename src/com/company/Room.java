package com.company;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Room {

    ArrayList <Furniture> listOfFurniture;
    double roomArea;

    public Room(ArrayList<Furniture> listOfFurniture, double roomArea) {
        this.listOfFurniture = listOfFurniture;
        this.roomArea = roomArea;

    }

    public double getPriceOfFurniture(){

        double res = 0;
        for (Furniture i : listOfFurniture) {
            res += i.getPrice();
        }
        return res;
    }
}
