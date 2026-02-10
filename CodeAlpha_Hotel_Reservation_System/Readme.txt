# 🏨 Hotel Reservation System

## 📌 Project Overview

The **Hotel Reservation System** is a console-based Java application that simulates real-world hotel booking operations.

Users can search rooms, make reservations, cancel bookings, and view reservation details.
The system is built using **Core Java, OOP principles, and File I/O** for persistence.

---

## 🚀 Features

* 🔎 Search available rooms
* 🛏️ Room categorization (Standard / Deluxe / Suite)
* 📅 Book hotel rooms
* ❌ Cancel reservations
* 💳 Payment simulation
* 📄 View reservation details
* 💾 File storage for booking persistence

---

## 🧱 Tech Stack

* Core Java
* OOP Principles
* Collections Framework
* File I/O (Serialization)

---

## 📁 Project Structure

```
com
├── app        → Client / Main class
├── bean       → Entities (Room, Reservation)
├── service    → Business logic
├── data       → In-memory storage
└── util       → File handling utilities
```

---

## 🏗️ System Design

### Entities

* Room
* Reservation

### Enums

* RoomType
* ReservationStatus

### Services

* RoomService → Search rooms
* ReservationService → Booking & cancellation
* PaymentService → Payment simulation

---

## 💾 Data Persistence

Reservations are stored in:

```
reservations.dat
```

using Object Serialization.

---

## ▶️ How to Compile & Run (Windows CMD)

From project root:

```
javac -d out com\app\*.java com\bean\*.java com\service\*.java com\data\*.java com\util\*.java
java -cp out com.app.HotelApp
```

---

## 🧪 Sample Workflow

1. View available rooms
2. Select room ID
3. Make payment
4. Booking confirmed
5. Cancel reservation if needed

---

## 📚 OOP Concepts Used

* Encapsulation
* Abstraction
* Layered Architecture
* Enum usage
* Serialization

---

## 🔮 Future Enhancements

* Date-wise booking
* Multiple rooms per reservation
* JDBC database integration
* Spring Boot Web version
