/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

/**
 *
 * @author AN-N
 */
public class Day10BinaryNumbers {
    private static final int BASE_TWO = 2;
    public static String reverseString(String string){
        String salida = "";
        for(int i = string.length()-1; i >= 0;i--){
            salida += string.charAt(i);
        }
        return salida;
    }

    public static String converToBinary(int number){
        int numberLocal = number;
        String salida = "";
        while(numberLocal > 0){
            int residuo = numberLocal % BASE_TWO;
            int div = numberLocal / BASE_TWO;
            salida += residuo;
            numberLocal = div;
        }
        return reverseString(salida);
    }
    
    public static void binaryNumber(String number){
        int count = 0;
        int maxCount = 0;
        for(int i = 0;i <= number.length()-1; i ++){
            if(number.charAt(i) == '1'){
                count++;
            }else{
                if(count > maxCount){
                    maxCount = count;
                }
                count = 0;
            }
        }
        if(count > maxCount){
            maxCount = count;
        }
        System.out.println(maxCount);
    }
    
    public static void main(String[] args) {
        String result = converToBinary(439);
        binaryNumber(result);
    }
}
