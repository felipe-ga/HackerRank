package com.exercises.strings;

/**
 * Function that, given a value, return whether it´s a prime number
 * @author Felipe Galindo
 */
public class PrimeNumber {
    public static boolean isPrime(int number){
        boolean isPrime = true;
        int limit = 3;
        int count = 1;
        for (int i = 2; i < number; i++) {
            int remainder = number % i;
            if(remainder == 0){
                count++;
            }
            if(count == limit){
                return false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        int number = 540;
        if(isPrime(number)){
            System.out.println(String.format("the number %d is prime", number));
        }else{
            System.out.println(String.format("the number %d is not prime", number));
        }
    }
}
