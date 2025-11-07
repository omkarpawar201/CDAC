package com.demo.test;

import com.demo.dao.CircularLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		CircularLinkedList cst = new CircularLinkedList();
		
		cst.add(1);
		cst.add(2);
		cst.add(3);
		cst.add(4);
		cst.add(5);
		
//		cst.addAtPos(6, 3);
		cst.display();
		
		cst.addAtValue(6, 5);
		cst.display();
		
		cst.deleteByValue(6);
		cst.display();
		
		cst.deleteByPos(5);
		cst.display();

	}

}
