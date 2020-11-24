/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

import java.util.Scanner;

/**
 *
 * @author anonimo
 */
public class Day15LinkedList {
    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head == null){
            head = new Node(data);
            return head;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next =  new Node(data);
        return head;
    }
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Give a N:");
        int N = sc.nextInt();

        while(N-- > 0) {
            System.out.println("Give a number:");
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
