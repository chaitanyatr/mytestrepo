package com.apex.user.service;

import java.util.Date;

import com.apex.user.service.vo.Employee;

public class UserService {
	public String sayHello(){
		return "hello";
	}
	
	public String sayHelloWithName(String name){
		return "hello "+name;
	}
	
	public int add(int i,int j){
		return i+j;
	}
	public Date getserverDate(){
		return new Date();
	}
	
	public Employee getEmployee(int empId){
		
		Employee employee=new Employee(empId,"ram","abc","fremont","CA","95035",1000+empId);
		return employee;
	}
	
}
