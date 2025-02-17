package org.circular;

public class Node<T> {
    T data;
    Node next;
    Node(T data) {
        this.data = data;
        next = null;
    }
    Node() {
        next = null;
        data = null;
    }
    void setData(T d){
        data = d;

    }

    T getData(){
        return data;
    }
}
