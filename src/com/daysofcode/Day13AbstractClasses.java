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
public class Day13AbstractClasses {
    
    public static void main(String[] args) {
        String title = "Principito";
        String author = "Antoine de Saint-Exupéry";
        int price = 15;

        Book book = new MyBook(title, author, price);
        book.display();
    }
}

