package com.quang.stacklinkedlist;


import java.util.LinkedList;

public class myStack<T> {
    public LinkedList<T> stack;

    public myStack() {
        stack = new LinkedList<>();

    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stack.removeFirst();

    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        } else
            return false;

    }
    public  void display(){
        for (int i = 0; i < stack.size();i++){
            System.out.println(stack.get(i));
        }
    }
}