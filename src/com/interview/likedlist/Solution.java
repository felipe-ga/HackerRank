package com.interview.likedlist;

public class Solution {
    public static void main(String[] args) {
        /*LinkedList linkedList = new LinkedList();
        linkedList.setHead(new Node(16));

        linkedList.addElementToEnd(13);
        linkedList.addElementToEnd(7);
        linkedList.printElements();

        linkedList.insertNodeAtPosition(1,1);
        linkedList.printElements();

        linkedList.addElementToEnd(15);
        linkedList.addElementToEnd(30);
        linkedList.addElementToEnd(210);
        linkedList.printElements();

        linkedList.insertNodeAtPosition(5000,0);
        linkedList.printElements();

        */
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        node2.setPrev(node1);
        node1.setNext(node2);
        Node node3 = new Node(4);
        node3.setPrev(node2);
        node2.setNext(node3);
        linkedList.setHead(node1);
        Node node4 = new Node(10);
        node3.setNext(node4);
        node4.setPrev(node3);
        linkedList.printElements();
        linkedList.addElementSorted(5);
        linkedList.printElements();

    }
}
