package com.interview.likedlist;

public class LinkedList {
    private Node head;

    public void setHead(Node head){
        this.head = head;
    }
    public Node getHead(){
        return this.head;
    }

    public void addElementToEnd(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(new Node(data));
    }

    public void insertNodeAtPosition(int data, int position){
        if(this.head == null){
            return;
        }
        if(position == 0){
            Node tmp = head;
            this.head = new Node(data);
            this.head.setNext(tmp);
            return;
        }
        if(position == 1){
            Node tmp = head.getNext();
            this.head.setNext(new Node(data));
            this.head.getNext().setNext(tmp);
            return;
        }
        Node current = this.head;
        int count = 1;
        while(current.getNext() != null){
            current = current.getNext();
            if(count + 1 == position){
                Node temp = current.getNext();
                current.setNext(new Node(data));
                current.getNext().setNext(temp);
                break;
            }
        }
    }

    public void printElements(){
        if(this.head == null){
            return;
        }
        Node current = head;
        System.out.print(String.format("%d->",current.getData()));
        while (current.getNext() != null){
            current = current.getNext();
            System.out.print(current.getData());
            if(current.getNext() != null){
                System.out.print("->");
            }
        }
        System.out.println();
    }

}
