/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Felipe Galindo
 */
public class NumberLineJumps {
    private static final String PATH = "\\src\\com\\algorithms\\numberlinejumpstest\\"; 
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int kangaroo1 = x1;
        int kangaroo2 = x2;
        for (int i = 0; i < 10000; i++) {
            kangaroo1 += v1;
            kangaroo2 += v2;
            if(kangaroo1 == kangaroo2){
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) throws IOException {
        File text = new File("");
        String url  = text.getAbsolutePath().concat(PATH).concat("input00.txt");
        System.out.println(url);
        Scanner scanner = new Scanner(new File(url));
        String[] x1V1X2V2 = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(x1V1X2V2[0]);
        int v1 = Integer.parseInt(x1V1X2V2[1]);
        int x2 = Integer.parseInt(x1V1X2V2[2]);
        int v2 = Integer.parseInt(x1V1X2V2[3]);
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
        scanner.close();
    }
}
