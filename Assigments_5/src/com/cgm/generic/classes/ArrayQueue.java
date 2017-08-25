package com.cgm.generic.classes;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;

import com.cgm.generic.interfaces.Operation;

@SuppressWarnings("rawtypes")
public class ArrayQueue<T> implements Operation {
	
	private T items[];
	private int front, rear;
	private int maxQueueSize;
	private int size;
	Queue<T> queue =  new LinkedList<T>();
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(Class<T> item, int maxQueueSize) {
		front = 0;
		rear = -1;
		size = 0;
		this.maxQueueSize = maxQueueSize;
		items = (T[]) Array.newInstance(item, maxQueueSize);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(Object item) {
		if (isFull())
			return;
		// move the queue to the start of the arraywhenever it reaches the end
		if (rear == maxQueueSize - 1) {
			int counter = 0;
			for (int count = front; count <= rear; count++) {
				items[counter++] = items[count];
			}
			front = 0;
			rear = size - 1;
		}
		items[++rear] = (T) item;
		size++;

	}

	@Override
	public T remove() {
		if (isEmpty())
			return null;
		T saved = items[front];
		items[front] = null;
		front++;
		size--;
		return saved;
	}

	@Override
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public boolean isFull() {
		return size == maxQueueSize;
	}
	
	public int size() {
		return size;
	}

	@Override
	public void list() {
		System.out.println(queue);

		for (int i = 0; i <= items.length - 1; i++) {
			System.out.print(items[i] + " ");
		}
		System.out.println();

	}

}
