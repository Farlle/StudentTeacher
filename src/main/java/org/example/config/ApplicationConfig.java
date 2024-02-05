package org.example.config;

import org.example.data.gradeandsubject.Grade;
import org.example.data.gradeandsubject.Subject;
import org.example.data.entity.Student;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("org.example.data")
public class ApplicationConfig {

    @Bean(initMethod = "enrollment")
    public Student student1() {
        Map<Subject, Grade> gradeBySubject = new HashMap();
        gradeBySubject.put(Subject.INFORMATICS, Grade.TWO);
        gradeBySubject.put(Subject.PHYSICS, Grade.TWO);
        gradeBySubject.put(Subject.MATHEMATICS, Grade.TWO);
        gradeBySubject.put(Subject.ENGLISH_LANGUAGE, Grade.FIVE);
        return new Student("Oleg", gradeBySubject);
    }

    @Bean(initMethod = "enrollment")
    public Student student2() {
        Map<Subject, Grade> gradeBySubject = new HashMap();
        gradeBySubject.put(Subject.INFORMATICS, Grade.TWO);
        gradeBySubject.put(Subject.PHYSICS, Grade.TWO);
        gradeBySubject.put(Subject.MATHEMATICS, Grade.FOUR);
        gradeBySubject.put(Subject.ENGLISH_LANGUAGE, Grade.THREE);
        return new Student("Jil", gradeBySubject);
    }

    @Bean(initMethod = "enrollment")
    public Student student3() {
        Map<Subject, Grade> gradeBySubject = new HashMap();
        gradeBySubject.put(Subject.INFORMATICS, Grade.FOUR);
        gradeBySubject.put(Subject.PHYSICS, Grade.FIVE);
        gradeBySubject.put(Subject.MATHEMATICS, Grade.FOUR);
        gradeBySubject.put(Subject.ENGLISH_LANGUAGE, Grade.FIVE);
        return new Student("Sashok", gradeBySubject);
    }

    @Bean
    public static BeanPostProcessor gradePostProcessor() {
        return new GradePostProcessor();
    }

}
