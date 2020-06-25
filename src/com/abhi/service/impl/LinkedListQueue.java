/**
 * 
 */
package com.abhi.service.impl;

import com.abhi.service.Queue;

/**
 * @author abhinav
 *
 */
public class LinkedListQueue implements Queue{

	private Node head;
	private Node tail;
	
	@Override
	public void create() {
		this.head = null;
		this.tail = null;
	}

	@Override
	public void enQueue(int value) {
		Node node = new Node(value);
		if(null != this.head) {
			this.tail.setNext(node);
			this.tail = node;
		}else {
			this.head = this.tail = node;
		}
		System.out.println("EnQueue the value = "+value);
	}

	@Override
	public int deQueue() {
		if(!isEmpty()) {
			Node node = this.head;
			this.head = this.head.getNext();
			System.out.println("DeQueue the value = "+ node.getValue());
			return node.getValue();
		}else {
			throw new RuntimeException("Queue is empty!!");
		}
	}

	@Override
	public int peek() {
		if(!isEmpty()) {
			System.out.println("Peek the value = "+ this.head.getValue());
			return this.head.getValue();
		}else {
			throw new RuntimeException("Queue is empty!!");
		}
	}

	@Override
	public boolean isEmpty() {
		if(null == this.head) {
			return true;
		}
		return false;
	}

	@Override
	public void delete() {
		System.out.println("Delete the Queue!!");
		this.head = this.tail = null;
	}

}
