/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author AN-N
 */
public class Day22BinarySearchTree {
    private static final String PATH = "\\src\\com\\daysofcode\\test\\Day22\\"; 
    public static int getHeight(NodeBinaryTree root){
        if(root == null){
            return 0;
        }
        int countLeft = 0;
        int countRight = 0;
        if(root.left != null){
            countLeft = 1 + getHeight(root.left);
        }
        if(root.right != null){
            countRight = 1 + getHeight(root.right);
        }
        if(countLeft > countRight){
            return countLeft;
        }else{
            return countRight;
        }
    }
    public static NodeBinaryTree insert(NodeBinaryTree root,int data){
        if(root==null){
            return new NodeBinaryTree(data);
        }
        else{
            NodeBinaryTree cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String arg[])throws FileNotFoundException, IOException{
        File text = new File("");
        String url  = text.getAbsolutePath().concat(PATH).concat("input00.txt");
        System.out.println(url);
        Scanner sc=new Scanner(new File(url));
        int T=sc.nextInt();
        NodeBinaryTree root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);  
    }
}
