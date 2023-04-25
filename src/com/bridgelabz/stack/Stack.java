package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.LinkedList;

public class Stack<T> {
    LinkedList<T> linkedList1=new LinkedList<>();
    public void push(T data) {
        linkedList1.add(data);
    }

}
