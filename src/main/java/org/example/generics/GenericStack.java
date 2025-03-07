package org.example.generics;

import java.util.Stack;

public class GenericStack<E> {
   private Stack<E> stack= new Stack<E>();
    public void  add(E e){
        stack.push(e);
    }
    public Stack<E> getStack(){
        return stack;
    }
}
