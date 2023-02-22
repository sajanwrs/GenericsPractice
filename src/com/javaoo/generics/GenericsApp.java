/**
 * 
 */
package com.javaoo.generics;

/**
 * @author waris
 *
 */
public class GenericsApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Stack<Integer> ints = new DequeStack<>();
//		Stack<String> strings = new DequeStack<>();
		
		Stack<Integer> ints = new GenericsStackImp<>();
		Stack<String> strings = new GenericsStackImp<>();
		
		if(ints.getClass() == strings.getClass())
			System.out.printf("Stack<Integer> and Stack<String> are both %s!\n", ints.getClass());
		
		strings.push("World");
		strings.push("Hello");
		
		ints.push(5);
		ints.push(3);
		ints.push(2);
		
	}

}
