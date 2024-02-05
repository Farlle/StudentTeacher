package org.example.data.gradeandsubject;

public enum Grade {
    FIVE(5),
    FOUR(4),
    THREE(3),
    TWO(2),
    ONE(1),

    ;

    private final int grade;

    Grade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
