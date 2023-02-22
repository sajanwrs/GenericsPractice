/**
 * 
 */
package com.javaoo.generics;

/**
 * @author waris
 *
 */
public class StackArray<E> implements Stack<E>{
	int tos;
	E[] stack;
	
	public StackArray() {
		this(10);
	}
	
	@SuppressWarnings("unchecked")
	public StackArray(int maxdepth) {
		tos = 0;
		stack = (E[]) new Object[maxdepth];
	}
	
	public void push(E element) {
		stack[tos++] = element;
	}
	
	public E pop() {
		return tos > 0? stack[--tos] : null;
	}
}
