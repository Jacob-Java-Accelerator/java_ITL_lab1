package org.example.generics;

public class Main {
	public static void main(String[] args) {
		GenericStack stack = new GenericStack();
		stack.add("3453");
		stack.add(3456);
		System.out.println(stack.getStack());
	}
}
