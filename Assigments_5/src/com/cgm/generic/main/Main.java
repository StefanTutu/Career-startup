package com.cgm.generic.main;

import com.cgm.generic.classes.ArrayQueue;
import com.cgm.generic.classes.ArrayStack;
import com.cgm.generic.classes.StackMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackMethod newStack = new StackMethod(6);

		newStack.push(10);
		newStack.push(1);
		newStack.push(50);
		newStack.push(20);
		newStack.push(90);
		newStack.push(14);

		newStack.display();
		newStack.pop();
		newStack.pop();
		newStack.pop();
		newStack.pop();
		newStack.display();

		ArrayStack<Integer> stack = new ArrayStack<>(Integer.class, 5);

		stack.add(5789);
		stack.add(56);
		stack.add(566);
		stack.add(746);
		stack.add(156);

		stack.list();
		System.out.println("Get stack " + stack.get());
		System.out.println("Remove stack " + stack.remove());
		System.out.println("Remove stack " + stack.remove());
		System.out.println("Remove stack " + stack.remove());
		System.out.println("Get stack " + stack.get());

		stack.list();

		ArrayQueue<Integer> queue = new ArrayQueue<>(Integer.class, 4);

		queue.add(8);
		queue.add(81);
		queue.add(247);
		queue.add(123);
		queue.add(23);

		queue.list();

		System.out.println("Queue get" + queue.get());
		System.out.println("Queue remove" + queue.remove());
		System.out.println("Queue remove" + queue.remove());
		System.out.println("Queue remove" + queue.remove());
		System.out.println("Queue remove" + queue.remove());
		System.out.println("Queue remove" + queue.remove());
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		System.out.println(queue.get());

	}

}
