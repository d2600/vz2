package com.test.vz2.hotel;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class RoomService {

    // 1. Declare a Collection to store Room Inventory
    private Collection <Room> colletions;

    public RoomService() {

        // 2. Initialize Collection and assign it to the Room Inventory
//        Collection to store Room Inventory
//        Collection <Room> colletions = new ArrayList<>();
        this.colletions = new LinkedHashSet<>();

    }
    public boolean hasRoom(Room room) {

        // 1. Returns a boolean that indicates if the Room Inventory contains a Room.

        return colletions.contains(room);
    }

    public Room[] asArray() {

        // 2. Returns all Rooms as an Array of Rooms in the **order** they were Added.
//        colletions.toArray();

        return this.colletions.toArray(new Room[0]);
    }

    public Collection<Room> getByType(String type){

	/*
	   3. Return a new Collection of Rooms where Room#type matches the provided String.
		  The original Room Inventory collection MUST NOT BE MODIFIED.
	*/
        Collection<Room> copy = new HashSet<>(this.colletions);
        copy.removeIf(r -> !r.getType().equals(type));
        return copy;


    }

    public void applyDiscount(final double discount) {

        //Reduces the rate of each room by the provided discount

//        Collection <Room> tempCollection = colletions
//                .stream()
//                .map(r ->{ r.setRate(r.getRate() * (1 - discount)); return r;})
//                .collect(Collectors.toList());
//        colletions.clear();
//        colletions.addAll(tempCollection);

        //solución de él
        this.colletions.forEach(r -> r.setRate(r.getRate() * (1 - discount)) );

    }

    public Collection<Room> getRoomsByCapacity(final int requiredCapacity) {

        //Returns a new collection of rooms that meet or exceed the provided capacity
        //me gustó mas mi solución, él hizo algo parecido a lo que yo hice en el applyDiscount
        return new HashSet<>(colletions
                .stream()
                .filter(r -> r.getCapacity() >= requiredCapacity)
                .collect(Collectors.toList()));

    }

    public Collection<Room> getRoomByRateAndType(final double rate, final String type){

        return new LinkedHashSet<>(colletions
                .stream()
                .filter(r -> ((r.getRate() < rate) && (r.getType().equals(type))))
                .collect(Collectors.toList()));
    }
    public Collection<Room> getInventory(){

        // 3. Return the Room Inventory

        return new HashSet<>(colletions);
    }

    public void createRoom(String name, String type, int capacity, double rate) {

        // 4. Add a new Room to the Room Inventory using the provided parameters
        colletions.add(new Room(name,type,capacity,rate));

    }

    public void createRooms(Room[] rooms) {

        // 5. Add the Rooms provided in the Array to the Room Inventory
//        Collection roomsList = new ArrayList<>();
        colletions.addAll((Arrays.asList(rooms)));
//        colletions.addAll(rooms);

    }

    public void removeRoom(Room room) {


        colletions.remove(room);

    }

}