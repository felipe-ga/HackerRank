/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Felipe Galindo
 */
public class InsertionPart1 {
    private static final String PATH = "\\src\\com\\algorithms\\insertionpart1tests\\"; 
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
//    static void insertionSort1(int n, int[] arr) {
//        int k=arr[arr.length-1];
//        boolean flag=false;
//        for(int i=arr.length-2;i>=0;i--){
//            if(arr[i]>k){
//                arr[i+1]=arr[i];
//            }else{
//                arr[i+1]=k;
//                flag=true;
//                break;
//            }
//            for(int j=0;j<n;j++){
//                System.out.print(arr[j]+" ");
//            }
//            System.out.println();
//        }
//        if(flag==false){
//            arr[0]=k;
//        }
//        for(int j=0;j<n;j++){
//                System.out.print(arr[j]+" ");
//            }
//    }
    static void insertionSort1(int n, int[] arr) {
        int[] array = arr;
        int number = array[n-1]; 
        for (int i = n-2; i >= 0; i--) {
            //System.out.println(i);
            //System.out.println(number);
            //System.out.println(array[i]);
            if(array[i] > number){
                array[i + 1] = array[i];
            }else if(array[i] < number){
                array[i + 1] = number;
                printArray(array);
                break;
            }else{
                if(i > 0){
                    array[i + 1] = array[i];
                }else{
                    array[i + 1] = number;
                }
            }
            printArray(array);
            if(i == 0 && number < array[i]){
                array[i] = number;
                printArray(array);
            }
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("");
        String url  = text.getAbsolutePath().concat(PATH).concat("input00.txt");
        Scanner scanner = new Scanner(new File(url));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        insertionSort1(n, arr);
        scanner.close();
    }
}
