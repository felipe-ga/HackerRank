/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author anonimo
 */
public class Day23BstLevelOrderTraversal {
    private static final String PATH = "//src//com//daysofcode//test//Day23//"; 
    private static Queue<NodeBinaryTree> queue = new LinkedList<NodeBinaryTree>();
    public static void enqueue(NodeBinaryTree value){
        queue.add(value);
    }
    public static NodeBinaryTree dequeue(){
        NodeBinaryTree value = (NodeBinaryTree) queue.remove();
        return value;
    }
    static void levelOrder(NodeBinaryTree root){
      //Write your code here
      if(root != null){
          enqueue(root);
          while(queue.size() > 0) {
            NodeBinaryTree node = dequeue();
            System.out.print(node.data + " ");
            if(node.left != null) {
                enqueue(node.left);
            }
            if(node.right != null) {
                enqueue(node.right);
            }
          }
      }
    }
    public static NodeBinaryTree insert(NodeBinaryTree root, int data) {
        if (root == null) {
            return new NodeBinaryTree(data);
        } else {
            NodeBinaryTree cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) throws FileNotFoundException {
        File text = new File("");
        String url  = text.getAbsolutePath().concat(PATH).concat("input00.txt");
        System.out.println(url);
        Scanner sc= new Scanner(new File(url));
        int T = sc.nextInt();
        NodeBinaryTree root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
