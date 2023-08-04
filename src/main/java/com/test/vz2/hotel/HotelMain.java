package com.test.vz2.hotel;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HotelMain {

    public HotelMain() {


    }
    public double setTestHotel () {
        Room mexicali = new Room("Mexicali","Premier Room", 4,175.00);
        Room ensenada = new Room("Ensenada","Suite", 5,110.00);
        Room tijuana = new Room("Tijuana","Guest", 1,20.00);
        Room tecate = new Room("Tecate","Guest Room", 3,20.00);

        Collection<Room> rooms = List.of(mexicali,ensenada,tijuana,tecate);
        double total = getRevenue(rooms);
        return total;
    }
    public double getRevenue (Collection<Room> collection){
        return collection
                .stream()
                .mapToDouble(r -> r.getRate())
                .sum();
    }

}
