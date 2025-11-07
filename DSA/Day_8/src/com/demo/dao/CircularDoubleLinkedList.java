package com.demo.dao;

public class CircularDoubleLinkedList {

	class DoubleNode {
		int data;
		DoubleNode next, prev;

		public DoubleNode(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	DoubleNode head;

	public DoubleNode add(int i) {

		DoubleNode newNode = new DoubleNode(i);

		if (head == null) {
			head = newNode;
			newNode.next = (head);
		} else {

			DoubleNode temp = head;

			while (temp.next != head) {
				temp = temp.next;
			}

			newNode.next = temp.next;
			head.prev = newNode;
			temp.next = newNode;
			newNode.prev = temp;
		}

		return head;
	}

	public void display() {

		DoubleNode temp = head;

		do {
			System.out.print(temp.data + "---->");
			temp = temp.next;
		} while (temp != head);
		System.out.println("head");

	}

	public DoubleNode addAtPos(int val, int pos) {
		DoubleNode newNode = new DoubleNode(val);

		if (pos == 1) {

			DoubleNode tail = head;

			while (tail.next != head) {
				tail = tail.next;
			}
			newNode.next = head;
			head.prev = newNode;
			tail.next = newNode;
			newNode.prev = tail;
			head = newNode;

		} else {

			DoubleNode temp = head;
			int i = 1;

			while (i < pos - 1) {
				temp = temp.next;
				i++;
			}

			newNode.next = temp.next;
			temp.next.prev = newNode;
			temp.next = newNode;
			newNode.prev = temp;
		}

		return head;

	}

	public void addAtValue(int num, int val) {
		DoubleNode newNode = new DoubleNode(num);

		if (head.data == val) {
			newNode.next = head.next;
			head.next.prev = newNode;
			head.next = newNode;
			newNode.prev = head;
		} else {

			DoubleNode temp = head;

			do {
				temp = temp.next;
			} while (temp != head && temp.data != val);

			newNode.next = temp.next;
			temp.next.prev = newNode;
			temp.next = newNode;
			newNode.prev = temp;
		}

	}

	public void deleteByPos(int pos) {

		if (pos == 1) {
			DoubleNode temp = head.next;
			head.next.prev = head.prev;
			head.prev.next = head.next;
			head.next = null;
			head.prev = null;
			head = temp;
		} else {
			DoubleNode temp = head;
			int i = 1;

			while (i < pos) {
				temp = temp.next;
				i++;
			}

			temp.next.prev = temp.prev;
			temp.prev.next = temp.next;
			temp.next = null;
			temp.prev = null;

		}

	}

	public void deleteByValue(int val) {
		if (head.data == val) {
			DoubleNode temp = head.next;
			head.next.prev = head.prev;
			head.prev.next = head.next;
			head.next = null;
			head.prev = null;
			head = temp;
		} else {

			DoubleNode temp = head;

			do {
				temp = temp.next;
			} while (temp != head && temp.data != val);

			temp.next.prev = temp.prev;
			temp.prev.next = temp.next;
			temp.next = null;
			temp.prev = null;                               
		}

	}

}
