package com.demo.test;

import com.demo.dao.CircularDoubleLinkedList;

public class TestDoubleLinkedList {

	public static void main(String[] args) {
		
		CircularDoubleLinkedList cst = new CircularDoubleLinkedList();
		
		cst.add(1);
		cst.add(2);
		cst.add(3);
		cst.add(4);
		cst.add(5);
		
		cst.display();
		
//		cst.addAtPos(6, 3);
//		cst.display();
		
		cst.addAtValue(6, 5);
		cst.display();
		
		cst.deleteByPos(6);
		cst.display();
		
		cst.deleteByValue(5);
		cst.display();

	}

}
