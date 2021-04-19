package com.quang.queueArray;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue<Integer> numbers = new MyQueue<>(4);
        numbers.enQueue(1);
        numbers.enQueue(2);
        numbers.enQueue(3);
        numbers.enQueue(4);
        numbers.display();
        System.out.println(numbers.deQueue());
        System.out.println("************");
        numbers.display();
    }
}
