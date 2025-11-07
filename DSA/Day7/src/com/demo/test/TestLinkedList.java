package com.demo.test;

import com.demo.dao.DoubleLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList lst = new DoubleLinkedList();

		lst.addAtEnd(1);
		lst.addAtEnd(2);
		lst.addAtEnd(3);
		lst.addAtEnd(4);
		lst.addAtEnd(5);

//		lst.addAtPos(6, 2);

		lst.display();

	}

}
