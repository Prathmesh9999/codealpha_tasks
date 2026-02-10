package com.service;

import com.bean.Reservation;
import com.bean.Room;
import com.data.DataStore;
import com.util.FileUtil;

public class ReservationService {

    private static int idCounter = 1000;
    private PaymentService paymentService =
            new PaymentService();

    public Reservation bookRoom(String userId, int roomId) {

        Room room = DataStore.rooms.get(roomId);

        if (room == null || !room.isAvailable()) {
            System.out.println("Room not available!");
            return null;
        }

        double amount = room.getPrice();

        if (!paymentService.makePayment(userId, amount))
            return null;

        room.book();

        Reservation res =
            new Reservation(++idCounter, userId,
                            roomId, amount);

        DataStore.reservations.put(
                res.getReservationId(), res);

        FileUtil.save(DataStore.reservations);

        return res;
    }

    public void cancelReservation(int id) {

        Reservation res =
            DataStore.reservations.get(id);

        if (res == null) {
            System.out.println("Reservation not found!");
            return;
        }

        res.cancel();
        DataStore.rooms
            .get(res.getRoomId())
            .release();
    }
}