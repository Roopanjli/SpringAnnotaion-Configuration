package com.ruby.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ruby.bean.Student;

@Configuration
public class AppContext {
AppContext(){
	}
@Bean(name="student")
public Student getStudent() {
	Student stu=new Student();
	return stu;
}
}
