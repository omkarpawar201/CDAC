package com.demo.dao;

import com.demo.beans.Node;

public class CircularLinkedList {
	Node head;

	public Node add(int i) {
		Node newNode = new Node(i);

		if (head == null) {
			head = newNode;
			newNode.setNext(head);
		} else {
			Node temp = head;

			while (temp.getNext() != head) {
				temp = temp.getNext();
			}

			temp.setNext(newNode);
			newNode.setNext(head);
		}

		return head;
	}

	public void display() {
		Node temp = head;

		do {
			System.out.print(temp.getData() + "---->");
			temp = temp.getNext();
		} while (temp != head);

		System.out.println("head");

	}

	public Node addAtPos(int num, int pos) {
		Node newNode = new Node(num);

		if (pos == 1) {
			Node temp = head;

			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
			newNode.setNext(head);
			head = newNode;
			temp.setNext(head);
		} else {
			Node temp = head;

			int i = 1;

			while (i < pos - 1) {
				temp = temp.getNext();
				i++;
			}
//			if (temp != head) { // not necessary
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
//			}
		}
		return head;
	}

	public Node addAtValue(int num, int val) {
		Node newNode = new Node(num);

		if (head.getData() == val) {
			newNode.setNext(head.getNext());
			head.setNext(newNode);
		} else {
			Node temp = head;

			do {
				temp = temp.getNext();
			} while (temp != head && temp.getData() != val);
//			System.out.println(temp.getData());
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);

		}

		return head;

	}

	public Node deleteByValue(int val) {
		if (head.getData() == val) {
			Node tail = head;
			Node temp = head;

			while (tail.getNext() != head) {
				tail = tail.getNext();
			}

			head = head.getNext();
			tail.setNext(head);
			temp.setNext(null);
		} else {

			Node temp = head;
			Node prev = null;

			do {
				prev = temp;
				temp = temp.getNext();
			} while (temp != head && temp.getData() != val);

			prev.setNext(temp.getNext());
			temp.setNext(null);
		}

		return head;
	}

	public Node deleteByPos(int pos) {
		if (pos == 1) {
			Node tail = head;
			Node temp = head;

			while (tail.getNext() != head) {
				tail = tail.getNext();
			}

			head = head.getNext();
			tail.setNext(head);
			temp.setNext(null);
		} else {

			Node temp = head;
			Node prev = null;
			int i = 1;

			while (i < pos) {
				prev = temp;
				temp = temp.getNext();
				i++;
			}

			prev.setNext(temp.getNext());
			temp.setNext(null);

		}

		return head;
	}

}
