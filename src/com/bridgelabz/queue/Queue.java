package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.LinkedList;

public class Queue<T> {
    LinkedList<T> linkedList=new LinkedList<>();

    public void enque(T data) {
        linkedList.append(data);
    }
    public void toPrint() {
        linkedList.display();
    }
}
