package com.quang.stacklinkedlist;

public class TestMyStack {
    public static void main(String[] args) {
        myStack<Integer> numbers = new myStack<>();

        numbers.push(11);
        numbers.push(10);
        numbers.push(22);
        numbers.push(48);
        numbers.push(23);
        numbers.push(90);
        numbers.display();

        int temp = numbers.pop();
        System.out.println(temp);
        System.out.println("***************");
        numbers.display();
        }
    }

