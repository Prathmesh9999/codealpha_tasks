package com.service;

import com.data.DataStore;
import com.bean.Room;

public class RoomService {

    public void viewAvailableRooms() {
        DataStore.rooms.values()
                .stream()
                .filter(Room::isAvailable)
                .forEach(System.out::println);
    }

    public Room getRoom(int id) {
        return DataStore.rooms.get(id);
    }
}