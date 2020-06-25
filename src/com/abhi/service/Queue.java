/**
 * 
 */
package com.abhi.service;

/**
 * @author abhinav
 *
 */
public interface Queue {
	void create();

	void enQueue(final int value);

	int deQueue();

	int peek();

	boolean isEmpty();
	
	void delete();
}
