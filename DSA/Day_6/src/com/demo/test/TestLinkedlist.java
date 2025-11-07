package com.demo.test;

import com.demo.dao.LinkedList;

public class TestLinkedlist {

	public static void main(String[] args) {
		 LinkedList lst = new LinkedList();
//		 lst.insertFront(1);
//		 lst.insertFront(2);
//		 lst.insertFront(3);
//		 lst.insertFront(4);
		 
		 lst.insertBack(1);
		 lst.insertBack(2);
		 lst.insertBack(3);
		 lst.insertBack(4);
		 
		 lst.display();
	}

}
