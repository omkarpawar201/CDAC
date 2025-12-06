package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Employee;
import com.demo.beans.HelloWorld;
import com.demo.beans.MyUser;

public class TestHelloWorld {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("springconfig.xml");
		HelloWorld hello = (HelloWorld) app.getBean("hello");

		System.out.println(hello.HelloWorld());

		Employee e = (Employee) app.getBean("emp1");
		String msg = hello.HelloWorld();
		System.out.println(e);

		Employee e1 = (Employee) app.getBean("emp2");
		System.out.println(e1);
		System.out.println("Message : " + msg);

		MyUser u1 = (MyUser) app.getBean("u1");
		System.out.println(u1);

		((ClassPathXmlApplicationContext) app).close();
	}

}
