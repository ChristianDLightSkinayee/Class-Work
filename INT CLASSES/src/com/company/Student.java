package com.company;

/**
 * Created by cd3300 on 2/25/2019.
 */
public class Student {
    int studentID;
    String name;
    double contentGrade;
    double workHabitGrade;
    double participation;
    int age;


    public Student(String Name, int ID, int Age) {
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
    }

    public Student() {
        name = "TestStudent";
        studentID = -1;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
        age = 18;

    }

    public void SetContentGrade(int grade) {
        contentGrade = grade;

    }

    public void SetParticipation(int grade) {
        participation = grade;
    }

    public void SetWorkHabit(int grade) {
        workHabitGrade = grade;
    }


    public double GetGrade() {
        return .35 * workHabitGrade + .4 * contentGrade + .25 * participation;

    }


    public double getContentGrade() {
        return contentGrade;
    }



public double Printgrade(){
        System.out.print(.35*workHabitGrade + .4*contentGrade +.25*participation);
        return (.35*workHabitGrade + .4*contentGrade +.25*participation);
}

}


