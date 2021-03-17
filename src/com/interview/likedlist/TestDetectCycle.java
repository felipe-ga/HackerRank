package com.interview.likedlist;

public class TestDetectCycle {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(2);
        linkedList.setHead(node1);
        Node node2 = new Node(2);
        node1.setNext(node2);
        Node node3 = new Node(2);
        node2.setNext(node3);
        node3.setNext(node2);
        if(linkedList.hasCycle()){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
