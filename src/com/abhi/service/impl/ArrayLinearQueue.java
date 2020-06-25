/**
 * 
 */
package com.abhi.service.impl;

import com.abhi.service.Queue;

/**
 * @author abhinav
 *
 */
public class ArrayLinearQueue implements Queue{
	private int[] queue;
	private int start;
	private int end;
	private int size;
	
	public ArrayLinearQueue(final int size) {
		this.size = size;
		this.queue = null;
	}
	
	@Override
	public void create() {
		this.queue = new int[this.size];
		this.start = -1;
		this.end = -1;
	}

	@Override
	public void enQueue(int value) {
		if(isInitialized() && !isFull()) {
			this.queue[++this.end] = value;
			System.out.println("\nEnQueue the value="+value+" at position "+ (this.end));
		}else {
			throw new RuntimeException("Queue is full!!");
		}
	}

	@Override
	public int deQueue() {
		if(isInitialized() && !isEmpty()) {
			System.out.println("\nDeQueue the value="+this.queue[this.start+1]+" from index "+ (this.start+1));
			return this.queue[++this.start];
		}else {
			throw new RuntimeException("Queue is empty!!");
		}
	}

	@Override
	public int peek() {
		if(isInitialized() && !isEmpty()) {
			System.out.println("\nPeek the value="+this.queue[this.start+1]+" from position "+ (this.start+1));
			return this.queue[this.start+1];
		}else {
			throw new RuntimeException("Queue is empty!!");
		}
	}

	@Override
	public boolean isEmpty() {
		if(isInitialized() && (this.start == this.end)) {
			return true;
		}
		return false;
	}

	@Override
	public void delete() {
		if(isInitialized()) {
			this.queue = null;
		}
	}
	
	private boolean isFull() {
		if(this.end == this.size-1) {
			return true;
		}
		return false;
	}
	
	public boolean isInitialized() {
		if(null != this.queue) {
			return true;
		}else {
			throw new RuntimeException("Queue not initialized!!");
		}
	}
	
}
