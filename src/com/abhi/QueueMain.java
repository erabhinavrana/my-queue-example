/**
 * 
 */
package com.abhi;

import com.abhi.service.Queue;
import com.abhi.service.impl.ArrayCircularQueue;
import com.abhi.service.impl.ArrayLinearQueue;
import com.abhi.service.impl.LinkedListQueue;

/**
 * @author abhinav
 *
 */
public class QueueMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		performArrayLinearQueueOperations();
		performArrayCircularQueueOperations();
		performLinkedListQueueOperations();
	}

	private static void performArrayLinearQueueOperations() {
		Queue linearQueue = new ArrayLinearQueue(5);
		linearQueue.create();
		linearQueue.enQueue(5);
		linearQueue.peek();
		linearQueue.enQueue(15);
		linearQueue.enQueue(25);
		linearQueue.deQueue();
		linearQueue.deQueue();
		linearQueue.deQueue();
		linearQueue.enQueue(35);
		linearQueue.peek();
		linearQueue.enQueue(45);
		linearQueue.peek();
		linearQueue.deQueue();
		linearQueue.deQueue();
		linearQueue.delete();

	}

	private static void performArrayCircularQueueOperations() {
		Queue circularQueue = new ArrayCircularQueue(5);
		circularQueue.create();
		circularQueue.enQueue(10);
		circularQueue.enQueue(20);
		circularQueue.enQueue(30);
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.enQueue(40);
		circularQueue.enQueue(50);
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.enQueue(60);
		circularQueue.enQueue(70);
		circularQueue.enQueue(80);
		circularQueue.enQueue(90);
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.enQueue(100);
		circularQueue.enQueue(110);
		circularQueue.enQueue(120);
		circularQueue.enQueue(130);
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.deQueue();
		circularQueue.delete();

	}

	private static void performLinkedListQueueOperations() {
		Queue linearQueue = new LinkedListQueue();
		linearQueue.create();
		linearQueue.enQueue(10);
		linearQueue.enQueue(20);
		linearQueue.enQueue(30);
		linearQueue.deQueue();
		linearQueue.deQueue();
		linearQueue.enQueue(40);
		linearQueue.enQueue(50);
		linearQueue.peek();
		linearQueue.peek();
		linearQueue.deQueue();
		linearQueue.deQueue();
		linearQueue.deQueue();
		linearQueue.enQueue(60);
		linearQueue.peek();
		linearQueue.deQueue();
		linearQueue.delete();
	}

}
