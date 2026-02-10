package com.data;

import com.bean.Room;
import com.bean.RoomType;

import java.util.HashMap;
import java.util.Map;

public class DataStore {

    public static Map<Integer, Room> rooms = new HashMap<>();
    public static Map<Integer, com.bean.Reservation> reservations =
            new HashMap<>();

    static {
        rooms.put(101,
            new Room(101, RoomType.STANDARD, 2000));

        rooms.put(102,
            new Room(102, RoomType.DELUXE, 3500));

        rooms.put(103,
            new Room(103, RoomType.SUITE, 5000));
    }
}