/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

import java.util.Stack;

/**
 *
 * @author anonimo
 */
public class Day10BinaryNumbers2 {
    private static final int BASE_TWO = 2;
    public static Stack converToBinary(int number){
        int numberLocal = number;
        Stack stack = new Stack();
        while(numberLocal > 0){
            int residuo = numberLocal % BASE_TWO;
            numberLocal = numberLocal / BASE_TWO;
            stack.push(new Integer(residuo));
        }
        return stack;
    }
    
    public static void binaryNumber(Stack stack){
        int count = 0;
        int maxCount = 0;
        while(!stack.empty()){
            int num = (Integer) stack.pop();
            if(num == 1){
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
        Stack stack = converToBinary(439);
        binaryNumber(stack);
        
    }
}
