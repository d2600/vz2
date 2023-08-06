package com.test.vz2.hotel;

import java.lang.reflect.Array;
import java.util.*;

public class RoomService {

    // 1. Declare a Collection to store Room Inventory
    List<Room> colletions=new ArrayList<>();

    public RoomService() {

        // 2. Initialize Collection and assign it to the Room Inventory
//        Collection to store Room Inventory
//        Collection <Room> colletions = new ArrayList<>();

    }

    public Collection<Room> getInventory(){

        // 3. Return the Room Inventory

        return colletions;
    }

    public void createRoom(String name, String type, int capacity, double rate) {

        // 4. Add a new Room to the Room Inventory using the provided parameters
        Room roomTemp = new Room(name,type,capacity,rate);
        colletions.add(roomTemp);

    }

    public void createRooms(Room[] rooms) {

        // 5. Add the Rooms provided in the Array to the Room Inventory
//        Collection roomsList = new ArrayList<>();
        colletions.addAll((Arrays.asList(rooms)));
//        colletions.addAll(rooms);

    }

    public void removeRoom(Room room) {

        // 6. Remove the provided Room from the Room Inventory
        System.out.println("1 size del Collections: "+colletions.size());
        int removeRoom = 0;
        if(colletions.equals(room)){
            System.out.println("si está");
        }
        ;
        for (int i = 0; i < colletions.size(); i++) {
            if (colletions.get(i).getName().equals(room.getName())){
                colletions.remove(i);
            }
        }

        System.out.println("2 size del Collections: "+colletions.size());

    }

}