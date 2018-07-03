package com.ruby.test;




import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ruby.bean.Student;
import com.ruby.cfg.AppContext;


public class Test {
	public static void main(String[] args) {
		
	
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
context.register(AppContext.class);
context.refresh();
Student stu=context.getBean("student",Student.class);
System.out.println(stu);

}
	
}