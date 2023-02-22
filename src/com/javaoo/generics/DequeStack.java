/**
 * 
 */
package com.javaoo.generics;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author waris
 *
 */
public class DequeStack<E> implements Stack<E> {

	private Deque<E> stack;
	
	public DequeStack() {
		stack = new LinkedList<E>();
	}
	@Override
	public void push(E element) {
		stack.push(element);
	}

	@Override
	public E pop() {	
		return stack.poll();
	}

}
