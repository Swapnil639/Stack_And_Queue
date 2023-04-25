package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.LinkedList;

public class Stack<T> {
    LinkedList<T> linkedList1=new LinkedList<>();
    public void push(T data) {
        linkedList1.add(data);
    }
    public void pop() {
        linkedList1.firstElementDelete();
    }

    public void peek() {
        linkedList1.peek();
    }

    public void toPrint() {
        linkedList1.display();
    }

}
