/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

/**
 *
 * @author anonimo
 */
public class RepeatString {
    static long countA(String s,long n,long dimension){
        long countA = 0;
        for(int i = 0;i < n - dimension;i++){
            if(s.charAt(i) == 'a'){
                countA++;
            }
        }
        return countA;
    }
    
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long countA = countA(s,s.length(),0);
        long countRepeated = 0;
        int dimension = s.length();
        long residuo = n % dimension;
        long cociente = n / dimension;
        countRepeated = countA * cociente;
        if(residuo != 0){ 
            countRepeated+= countA(s,n, (dimension * cociente));
        }
        return countRepeated;
    }
    public static void main(String[] args) {

        String s = "udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps";
        long n = 872514961806l;
        long result = repeatedString(s, n);
        System.out.print(result);
    }
}
