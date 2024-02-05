package org.example.data;

import org.springframework.stereotype.Component;

import java.util.List;
public class Teacher {
    private String name;
    private List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
