/**
 * 
 */
package com.abhi.service.impl;

/**
 * @author abhinav
 *
 */
public class Node {
	private int value;
	private Node next;
	
	public Node(final int value) {
		this.value = value;
		this.next = null;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
