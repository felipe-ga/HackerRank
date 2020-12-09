/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author anonimo
 */
public class Day24MoreLinkedList {
    private static final String PATH = "//src//com//daysofcode//test//Day24//";
    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            Node start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;

        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static Node removeDuplicates(Node head) {
        //Write your code here
        if (head == null || head.next == null) {
            return head;
        }
        if (head.data == head.next.data) {
            head.next = head.next.next;
            removeDuplicates(head);
        } else {
            removeDuplicates(head.next);
        }
        return head;
    }

    public static void main(String args[]) throws FileNotFoundException {
        File text = new File("");
        String url  = text.getAbsolutePath().concat(PATH).concat("input00.txt");
        Scanner sc= new Scanner(new File(url));
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);
    }
}
