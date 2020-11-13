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
public class Day4ClassInstance {
    private int age;	
  
	public Day4ClassInstance(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if(initialAge < 0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }else{
            this.age = initialAge;
        } 
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String mensaje = "";
        if(this.age < 13){
            mensaje = "You are young.";
        }else if(this.age >= 13 && this.age < 18){
            mensaje = "You are a teenager.";
        }else{
            mensaje = "You are old.";
        }    
        System.out.println(/*Insert correct print statement here*/mensaje);
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age++;
	}
        
        public static void main(String arg[]){
            Day4ClassInstance day4ClassInstance = new Day4ClassInstance(4);
            day4ClassInstance.amIOld();
        }
}

