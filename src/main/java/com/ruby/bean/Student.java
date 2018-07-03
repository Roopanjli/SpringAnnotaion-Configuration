package com.ruby.bean;

import org.springframework.beans.factory.annotation.Value;

public class Student 
{
	@Value("Roopanjli")
  private String name;




@Override
public String toString() {
	return "Student [name=" + name + "]";
} 
}
