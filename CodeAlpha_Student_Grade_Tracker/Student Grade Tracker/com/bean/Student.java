package com.bean;
import java.util.*;

public class Student {

    private int rno;
    private String name;
    private ArrayList<Integer> marks;
    private double percentage;
    private Grade grade;

    public Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPercentage(double percentage) {
        this.percentage=percentage;
    }
    public void setGrade(Grade grade){
        this.grade=grade;
    }

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public double getPercentage() {
        return percentage;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString(){
        return "["+rno+" | "+name+" | "+percentage+"| "+grade+" ]";
    }


}
