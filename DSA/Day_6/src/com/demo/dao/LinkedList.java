package com.demo.dao;

import com.demo.node.Node;

public class LinkedList {
	Node head;

	public Node insertFront(int i) {
		Node newNode = new Node(i);
		newNode.setNext(head);
		head = newNode;
		return head;
	}

	public void display() {
		Node next = head;

		while (next != null) {
			System.out.print(next.getData() + " ");
			next = next.getNext();
		}
	}

	public Node insertBack(int i) {
		Node newNode = new Node(i);

		if (head == null) {
			head = newNode;
			return head;
		}

		Node curret = head;

		while (curret.getNext() != null) {
			curret = curret.getNext();
		}

		curret.setNext(newNode);

		return head;
	}

}