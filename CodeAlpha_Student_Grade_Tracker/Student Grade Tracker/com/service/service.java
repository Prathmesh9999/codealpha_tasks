package com.service;
import com.bean.*;
import java.util.ArrayList;

public interface service {
     double calculatePercentage(Student s);
     void addStudent(int rno,String name);
     Grade CalculateGrade(double percentage);
     Student createStudent(int rno,String name);
     void displayAllStudents();
     ArrayList<Integer> acceptMarks();
}
