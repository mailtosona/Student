package com.Roman;

import model.Grade;
import model.Group;
import model.student;

public class Main {

    public static void main(String[] args) {
        Grade grade = new Grade();
        grade.setGrade('B');
        Group group = new Group();
        group.setGroup(3);

        student student = new student("Maya",grade,group,"Pappu");
        System.out.println("----------------"+student.getStudentname());
        System.out.println(student.getGrade());
        System.out.println(student.getGroup());
    }
}
