package com.quang.queuelinkedlist;

public class TestMyQueue {
    public static void main(String[] args) {
        myQueue<String> cars = new myQueue<>();
        cars.addQueue("BMW");
        cars.addQueue("Mec");
        cars.addQueue("Honda");
        cars.addQueue("Toyota");
        cars.addQueue("Suzuki");

        cars.display();
        System.out.println(cars.pullQueue());
        System.out.println("****************");
        cars.display();
    }
}
