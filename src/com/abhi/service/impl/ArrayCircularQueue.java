/**
 * 
 */
package com.abhi.service.impl;

import com.abhi.service.Queue;

/**
 * @author abhinav
 *
 */
public class ArrayCircularQueue implements Queue {
	private int[] queue;
	private int start;
	private int end;
	private int size;

	public ArrayCircularQueue(final int size) {
		this.size = size;
		this.queue = null;
	}

	@Override
	public void create() {
		this.queue = new int[this.size];
		this.start = 0;
		this.end = -1;
	}

	@Override
	public void enQueue(int value) {
		if (isInitialized() && !isFull()) {
			if (this.end + 1 == this.size) {
				this.end = -1;
			}
			this.queue[++this.end] = value;
			System.out.println("EnQueue the value=" + value + " at position " + (this.end + 1));
		} else {
			throw new RuntimeException("Queue is full!!");
		}
	}

	@Override
	public int deQueue() {
		if (isInitialized() && !isEmpty()) {
			int result = this.queue[this.start];
			System.out.println("DeQueue the value=" + result + " from index " + (this.start + 1));
		
			if (this.start == this.end) {
				this.start = this.end = -1;
			} else if (this.start + 1 == this.size) {
				this.start = -1;
			}
			this.start++;
			return result;
		} else {
			throw new RuntimeException("Queue is empty!!");
		}
	}

	@Override
	public int peek() {
		if (isInitialized() && !isEmpty()) {
			System.out.println("Peek the value=" + this.queue[this.start] + " from position " + (this.start + 1));
			return this.queue[this.start];
		} else {
			throw new RuntimeException("Queue is empty!!");
		}
	}

	@Override
	public boolean isEmpty() {
		if (isInitialized() && (this.start == 0 && this.end == -1)) {
			return true;
		}
		return false;
	}

	@Override
	public void delete() {
		if (isInitialized()) {
			this.queue = null;
		}
	}

	private boolean isFull() {
		if ((this.end != -1 && this.end + 1 == this.start) || (this.start == 0 && this.end + 1 == this.size)) {
			return true;
		}
		return false;
	}

	public boolean isInitialized() {
		if (null != this.queue) {
			return true;
		} else {
			throw new RuntimeException("Queue not initialized!!");
		}
	}

}
