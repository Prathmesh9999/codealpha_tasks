package com.app;

import com.bean.Reservation;
import com.service.ReservationService;
import com.service.RoomService;
import java.util.Scanner;

public class HotelApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RoomService roomService = new RoomService();
        ReservationService resService =
                new ReservationService();

        while (true) {

            System.out.println("\n1 View Rooms");
            System.out.println("2 Book Room");
            System.out.println("3 Cancel Reservation");
            System.out.println("4 Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    roomService.viewAvailableRooms();
                    break;

                case 2:
                    System.out.print("User ID: ");
                    String user = sc.next();

                    System.out.print("Room ID: ");
                    int roomId = sc.nextInt();

                    Reservation r =
                        resService.bookRoom(user, roomId);

                    if (r != null)
                        System.out.println(r);
                    break;

                case 3:
                    System.out.print("Reservation ID: ");
                    resService.cancelReservation(
                            sc.nextInt());
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}