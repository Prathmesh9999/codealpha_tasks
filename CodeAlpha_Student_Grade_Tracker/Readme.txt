# 🎓 Student Grade Tracker

## 📌 Project Overview

The **Student Grade Tracker** is a console-based Java application designed to manage and track student academic performance.

It allows users to store student details, assign grades, calculate averages, and display performance reports.
The system is implemented using **Core Java and Object-Oriented Programming (OOP)** principles.

---

## 🚀 Features

* 👨‍🎓 Add student records
* 📝 Assign grades / marks
* 📊 Calculate average marks
* 🏆 Display grade performance
* 📄 View student report details

---

## 🧱 Tech Stack

* Core Java
* OOP Principles
* Java Collections (List / Map)

---

## 📁 Project Structure

```
com
├── app        → Main / Client class
├── bean       → Entities (Student, Grade)
└── service    → Business logic & operations
```

---

## 🏗️ System Design

### Entities (Bean Layer)

* **Student**

  * Student ID
  * Name
  * List of grades

* **Grade**

  * Subject
  * Marks
  * Grade value

---

### Service Layer

Handles:

* Adding students
* Assigning grades
* Calculating averages
* Generating reports

---

### App Layer

* Console interaction
* Menu operations
* Calls service methods

---

## ▶️ How to Compile & Run (Windows CMD)

From project root:

```
javac -d out com\app\*.java com\bean\*.java com\service\*.java
java -cp out com.app.StudentGradeTrackerMain
```

---

## 🧪 Sample Workflow

1. Add student
2. Enter subject marks
3. Calculate average
4. Display grade report

---

## 📚 OOP Concepts Used

* Encapsulation
* Class & Object modeling
* Layered architecture
* Collection handling

---

## 🔮 Future Enhancements

* File / Database storage
* GPA calculation
* Subject-wise analytics
* GUI interface
* Web version

---

## 👨‍💻 Author

Developed as a learning project to practice **Java OOP system design and student data management**.
