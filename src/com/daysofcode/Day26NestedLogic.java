/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

import static com.daysofcode.Day25RunningAndComplexity.calculatePrime;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author anonimo
 */
public class Day26NestedLogic {
    private static final String PATH = "//src//com//daysofcode//test//Day26//";
    public static void main(String args[]) throws FileNotFoundException {
        File text = new File("");
        String url  = text.getAbsolutePath().concat(PATH).concat("input00.txt");
        Scanner scan = new Scanner(new File(url));
        int dReturned = scan.nextInt();
        int mReturned = scan.nextInt();
        int yReturned = scan.nextInt();
        int dDue = scan.nextInt();
        int mDue = scan.nextInt();
        int yDue = scan.nextInt();
        long pay = 0;
        if(mReturned > mDue && yReturned == yDue){
            pay = 500 * (mReturned - mDue);
        }else if(dReturned > dDue && (yReturned == yDue && mReturned == mDue)){
            pay = 15 * (dReturned - dDue);
        }else if(yReturned > yDue){
            pay = 10000;
        }
        System.out.println(pay); 
    }
}
