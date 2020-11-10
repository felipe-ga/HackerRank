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
public class Day2Operators {
    public static void main(String arg[]){
        double meal_cost = 15.0;
        int tip_percent =15;
        int tax_percent = 10;
        solve(meal_cost,tip_percent,tax_percent);
    }
    
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        //double dTip_percent = tip_percent;
        //double dTax_percent = tax_percent;
        double tipValue = Double.parseDouble(String.valueOf(tip_percent)) / 100;
        double taxValue = Double.parseDouble(String.valueOf(tax_percent)) / 100;
        double tip = meal_cost * tipValue;
        double tax = meal_cost * taxValue;
        double total = meal_cost + tip + tax;
        System.out.println(Math.round(total));
        
    }
}
