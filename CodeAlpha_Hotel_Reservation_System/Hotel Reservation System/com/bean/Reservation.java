package com.bean;

import java.io.Serializable;

public class Reservation implements Serializable {

    private int reservationId;
    private String userId;
    private int roomId;
    private double amount;
    private ReservationStatus status;

    public Reservation(int id, String userId,
                       int roomId, double amount) {
        this.reservationId = id;
        this.userId = userId;
        this.roomId = roomId;
        this.amount = amount;
        this.status = ReservationStatus.CONFIRMED;
    }

    public int getReservationId() { return reservationId; }
    public int getRoomId() { return roomId; }

    public void cancel() {
        status = ReservationStatus.CANCELLED;
    }

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId +
               "\nUser: " + userId +
               "\nRoom: " + roomId +
               "\nAmount: ₹" + amount +
               "\nStatus: " + status;
    }
}