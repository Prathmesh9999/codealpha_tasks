package com.service;
import com.bean.*;
import java.util.*;

public class StudentService implements service {
      private ArrayList<Student> studs;
      private int StudCount;

      public StudentService(){
            studs=new ArrayList<>();
            StudCount=0;
      }

      
      @Override
      public void addStudent(int rno,String name){
            Student s=createStudent(rno, name);
            if(s==null){

                  System.out.println("\nNo Student Passed!");
                  return;
            }
            
            s.setMarks(acceptMarks());
            
            double percentage=calculatePercentage(s);
            s.setPercentage(calculatePercentage(s));
            s.setGrade(CalculateGrade(percentage));
            studs.add(s);
            System.out.println("\nStudent Added Successfully !");
            StudCount++;
      }

      @Override
      public Student createStudent(int rno,String name){
            return new Student(rno, name);
      }
      @Override
      public ArrayList<Integer> acceptMarks(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter 5 Subject Marks : ");
            ArrayList<Integer> mark=new ArrayList<>();
            for(int i=0;i<5;i++){
                  int marks=Integer.parseInt(sc.next());
                  mark.add(marks);
            }
            return mark;
            
      }

      @Override
      public Grade CalculateGrade(double percentage){
               if(percentage>=90){
                return Grade.A;  
               }
               if(percentage<90&&percentage>=80){
                return Grade.B;
               }
               if(percentage<80&&percentage>=70){
                return Grade.C;
               }
               if(percentage<70&&percentage>=60){
                return Grade.D;
               }
               else
               return Grade.F;
      }

      @Override
      public double calculatePercentage(Student s){
         double per=0;
         
         ArrayList<Integer> Marks=s.getMarks();

         for(int i:Marks){
            per=per+i;
         }
         return (double)per/Marks.size();
      }
      
      @Override
      public void displayAllStudents(){
            for( Student i: studs){
                  System.out.println("\n-----REPORT OF STUDENT-----\n"+i);
      
            }
      }



}
    
