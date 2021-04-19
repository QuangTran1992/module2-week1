package com.quang.queuelinkedlist;

import java.util.LinkedList;

public class myQueue<T> {
    public LinkedList<T> queue;



    public myQueue() {
        this.queue = new LinkedList<T>();
    }

    public void addQueue(T e){
        queue.addLast(e);
    }


    public T pullQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is not element");
            return null;

        }
        return queue.removeFirst();
    }
    public void display(){
        for( int i = 0 ; i < queue.size();i++){
            System.out.println(queue.get(i) + " ");
        }
    }

}
