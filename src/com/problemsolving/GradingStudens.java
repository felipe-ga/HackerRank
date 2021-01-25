/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.problemsolving;

import static com.problemsolving.BirthdayCakeCandles.birthdayCakeCandles;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anonimo
 */
public class GradingStudens {
    private static final String PATH = "//src//com//problemsolving//gradingstudentests//";  
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<Integer>();
        for(Integer grade : grades){
            int residuo = grade % 5;
            int valueFinal = 0;
            if(grade < 35 || residuo == 0){
                valueFinal = grade;
            }else{
                int temp = (grade - residuo) + 5;
                if(temp - grade < 3){
                    valueFinal = temp;
                }else{
                    valueFinal = grade;
                }
            }
            result.add(valueFinal);
        }
        
        return result;
    }
    public static void main(String[] args) throws FileNotFoundException {

        File text = new File("");
        String url  = text.getAbsolutePath().concat(PATH).concat("input00.txt");
        System.out.println(url);
        Scanner sc=new Scanner(new File(url));
        
        int gradesCount = sc.nextInt();

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            grades.add(sc.nextInt());
        }
        
        List<Integer> result = gradingStudents(grades);
        
        for(Integer grade : result){
            System.out.print(grade + " ");
        }
    }
}
