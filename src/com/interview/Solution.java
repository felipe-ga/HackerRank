/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author AN-N
 */
public class Solution {
    static void minimumBribes(int[] q) {
        int bribes = 0;
        int len = 1;
        for(int a : q){
            int diff = a - len;
            System.out.println("diff " + diff);
            if(diff > 0 && diff < 3){
                bribes += diff;
            }else if(diff > 2){
                System.out.println("Too chaotic");
                return;
            }else if(Math.abs(diff) > 2){
                bribes += (Math.abs(diff) - 3);
                
            }
            len++;
        }
        System.out.println(bribes);
    }
    public static void main(String[] args) throws FileNotFoundException {
        //creating File instance to reference text file in Java
        File text = new File("C:\\test\\input03.txt");
     
        //Creating Scanner instnace to read File in Java
        Scanner scanner = new Scanner(text);
        
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < 1; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
