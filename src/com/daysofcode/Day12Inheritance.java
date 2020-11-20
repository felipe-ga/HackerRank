/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daysofcode;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName,String lastName,int id,int[] scores){
        super(firstName,lastName,id);
        testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int sum = 0;
        for(int i : testScores){
            sum += i;
        }
        int div = sum / testScores.length;
        System.out.println(div);
        if(div >= 40 && div < 55){
            return 'D';
        }else if(div >= 55 && div < 70){
            return 'P';
        }else if(div >= 70 && div < 80){
            return 'A';
        }else if(div >= 80 && div < 90){
            return 'E';
        }else if(div >= 90 && div <= 100){
            return 'O';
        }else{
            return 'T';
        } 
    }
}
/**
 *
 * @author AN-N
 */
public class Day12Inheritance {
    public static void main(String arg[]){
        
        String firstName = "";
	String lastName = "";
	int id = 18898989;
	int[] testScores = {100,100,100,100,100,100,100,100};
		
	Student s = new Student(firstName, lastName, id, testScores);
	s.printPerson();
	System.out.println("Grade: " + s.calculate() );
    }
}
