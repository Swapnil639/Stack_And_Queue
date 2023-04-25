package com.bridgelabz.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enque(56);
        queue.enque(30);
        queue.enque(70);
        queue.toPrint();
        
    }
}
