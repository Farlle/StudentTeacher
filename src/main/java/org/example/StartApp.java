package org.example;

import org.example.config.ApplicationConfig;
import org.example.data.entity.Student;
import org.example.data.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

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
