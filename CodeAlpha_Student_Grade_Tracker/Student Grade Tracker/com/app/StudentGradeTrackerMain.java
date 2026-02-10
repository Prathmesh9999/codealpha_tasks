package com.app;
import com.service.*;
import java.util.*;

public class StudentGradeTrackerMain {
       public static void main(String[]args){
              StudentService studSer=new StudentService();
              Scanner sc=new Scanner(System.in);
              int rno;
              String name;
              System.out.println("Enter 3 Student Details : ");
              for (int i = 1; i < 4; i++) {
                     System.out.println("Student : "+i);
                     System.out.println("Enter Name : ");
                     name=sc.nextLine();
                     System.out.println("Enter Roll No  : ");
                     rno=Integer.parseInt(sc.nextLine());
                     studSer.addStudent(rno,name);
              }

              System.out.println("\n-------|SUMMARY OF ALL STUDENTS|-------\n");
              studSer.displayAllStudents();
       

       }
}
