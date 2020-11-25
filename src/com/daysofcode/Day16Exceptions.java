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
public class Day16Exceptions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a number:");
        String S = in.next();
        try{
            int number = Integer.parseInt(S);
            
            System.out.println(number);
        }catch(Exception e){
            System.out.println("Bad String");
        }
    }
}
