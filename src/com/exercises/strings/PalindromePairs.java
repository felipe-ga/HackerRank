package com.exercises.strings;
/**
 * Given a list words, find all pairs of unique indices such that the concatenation of the two words is a palindrome.
 * @author Felipe Galindo
 */
public class PalindromePairs {
    private static boolean isPalindrome(String word){
        for (int i = 0,j = word.length()-1; i < word.length(); i++,j--) {
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
        }
        return true;
    }
    private static String[] palindromePair(String[] words){
        String[] result = new String[words.length];
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(i == j){
                    continue;
                }
                if(isPalindrome(words[i] + words[j])){
                    result[++count] = String.format("%d,%d",i,j);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] words = {"code","edoc","da","d"};
        String[] result = palindromePair(words);
        for (int i = 0; i < result.length; i++) {
            if(result[i] != null){
                System.out.println(result[i]);   
            }
        }
    }
}
