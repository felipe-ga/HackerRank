package com.interview.likedlist;

public class Solution {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
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

    }
}
