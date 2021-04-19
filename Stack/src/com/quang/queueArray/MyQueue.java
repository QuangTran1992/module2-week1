package com.quang.queueArray;

public class MyQueue<E> {
    private int capacity;
    private E queueArr[];
    private int size = 0;

    public MyQueue(int size) {
        this.capacity = size;
        queueArr = (E[]) new Object[this.capacity];
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public boolean isQueueFull() {
        return (size == capacity) ? true : false;
    }

    public void enQueue(E item) {
        if (isQueueFull()) {
            System.out.println("Queue is full");
        } else {
            queueArr[size] = item;
            size++;
        }
    }

    public E deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is null");
            return null;
        }
        else{
            E temp = queueArr[0];
            for (int i = 0; i < queueArr.length-1; i++) {
                queueArr[i ] = queueArr[i+1];
            }
            queueArr[queueArr.length-1]=null;
            size--;
            return (E) temp;
        }
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(queueArr[i]);
        }
    }
}

