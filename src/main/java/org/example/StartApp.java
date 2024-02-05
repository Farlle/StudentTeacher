package org.example;

import org.example.data.Student;
import org.example.data.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        var student1 = applicationContext.getBean("student1", Student.class);
        var student2 = applicationContext.getBean("student2", Student.class);
        var student3 = applicationContext.getBean("student3", Student.class);
        var teacher = applicationContext.getBean(Teacher.class);

        System.out.println(student1 + "\n" +
                student2 + "\n" +
                student3);

        System.out.println(teacher);

    }
}
