/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

/**
 *
 * @author anonimo
 */
public class Difference {
    private int[] elements;
    public int maximumDifference;

	// Add your code here
    public Difference(int[] elements){
        this.elements = elements;
    }
    public void computeDifference(){
        maximumDifference = Math.abs(elements[0] - elements[1]); 
        for(int i = 0;i < elements.length;i++){
            for(int j = i + 1;j < elements.length;j++){
                int difference = Math.abs(elements[i] - elements[j]);
                if(difference > maximumDifference){
                    maximumDifference = difference;
                }    
            }
            
        }
    }
}
