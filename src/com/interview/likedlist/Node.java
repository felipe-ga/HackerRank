package com.interview.likedlist;

public class Node {
    private int data;
    private Node next;
    private Node prev;

    public Node(int data){
        this.data = data;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){
        this.next =  next;
    }
    public Node getPrev(){
        return  this.prev;
    }
    public void setPrev(Node prev){
        this.prev = prev;
    }

}
