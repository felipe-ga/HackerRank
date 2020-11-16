/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author anonimo
 */
public class Day8DictionariesAndMaps {
    public static void main(String []argh){
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = 0;
        boolean continueProcces = false;
        while(!continueProcces){
            try{
                System.out.print("Give total of list:");
                n = in.nextInt();
                continueProcces = true;
            }catch(Exception e){
                System.out.print("Please give a typue number");
            }
        }
        
        if(n > 0){
            for(int i = 0; i < n; i++){
                System.out.print("Give contact name:");
                String name = in.next();
                System.out.print("Give phone number:");
                int phone = in.nextInt();
                // Write code here
                phoneBook.put(name.trim(), phone);
                System.out.println("Contact added");
            }
            System.out.println("Give a name to looking for:");
            while(in.hasNext()){
                System.out.println("Give a name to looking for:");
                String s = in.next();
                // Write code here
                if(phoneBook.get(s) != null){
                    System.out.println( s + "=" + phoneBook.get(s));
                }else{
                    System.out.println("Not found");
                }
            }
        }
        
        
        in.close();
    }
}
