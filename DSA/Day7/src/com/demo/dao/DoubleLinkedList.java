package com.demo.dao;

import com.demo.beans.Node;

public class DoubleLinkedList {
	Node head;

	public Node addAtEnd(int i) {
		Node newNode = new Node(i);

		if (head == null) {
			newNode.setNext(head);
			head = newNode;
			return head;
		}

		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(newNode);
		newNode.setPrev(temp);

		return head;

	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}

	}

	public void addAtPos(int num, int pos) {
		Node newNode = new Node(num);

		if (pos == 1) {
			newNode.setNext(head);
			head = newNode;
		}

		Node temp = head;

		int i = 1;

		while (i < pos - 1) {
			temp = temp.getNext();
		}
		
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);

	}

}
