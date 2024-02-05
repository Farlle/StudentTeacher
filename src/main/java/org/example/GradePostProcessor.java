package org.example;

import org.example.data.gradeandsubject.Grade;
import org.example.data.entity.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class GradePostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student && ((Student) bean).getName().equals("Jil")) {
            ((Student) bean).getGradeBySubject().replaceAll((k, v) -> Grade.FIVE);
        }
        return bean;
    }
}
