package com.bean;

public class Room {

    private int roomId;
    private RoomType type;
    private double price;
    private boolean available;

    public Room(int roomId, RoomType type, double price) {
        this.roomId = roomId;
        this.type = type;
        this.price = price;
        this.available = true;
    }

    public int getRoomId() { return roomId; }
    public RoomType getType() { return type; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return available; }

    public void book() { available = false; }
    public void release() { available = true; }

    @Override
    public String toString() {
        return roomId + " | " + type + " | ₹" + price +
               " | " + (available ? "AVAILABLE" : "BOOKED");
    }
}