package org.example.data.entity;

import org.example.data.gradeandsubject.Grade;
import org.example.data.gradeandsubject.Subject;

import java.util.Map;

public class Student {
    private String name;
    private Map<Subject, Grade> gradeBySubject;
    boolean student = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Subject, Grade> getGradeBySubject() {
        return gradeBySubject;
    }

    public void setGradeBySubject(Map<Subject, Grade> gradeBySubject) {
        this.gradeBySubject = gradeBySubject;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    private double getAverageGrade() {
        return gradeBySubject
                .values()
                .stream()
                .mapToDouble(Grade::getGrade)
                .average()
                .orElse(0.0);
    }

    private void enrollment() {
        if (getAverageGrade() >= 3.0) {
            this.student = true;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeBySubject=" + gradeBySubject +
                ", student=" + student +
                '}';
    }

}
