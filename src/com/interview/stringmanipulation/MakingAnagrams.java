/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Felipe Galindo
 */
public class MakingAnagrams {
    static int makeAnagram(String a, String b) {
        int numberDeletions = 0;
        HashMap<Character,Integer> wordA = new HashMap<Character,Integer>();
        HashMap<Character,Integer> wordB = new HashMap<Character,Integer>();
        for(int i = 0; i < a.length();i++){
            if(wordA.containsKey(a.charAt(i))){
                int value = (int)wordA.get(a.charAt(i));
                wordA.put(a.charAt(i), (value + 1));
            }else{
                wordA.put(a.charAt(i),1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(wordB.containsKey(b.charAt(i))){
                int value = (int)wordB.get(b.charAt(i));
                wordB.put(b.charAt(i), (value + 1));
            }else{
                wordB.put(b.charAt(i),1);
            }
        }
        HashMap<Character,Integer> counted = new HashMap<Character,Integer>();
        for (HashMap.Entry<Character,Integer> entry : wordA.entrySet()) {
            if(wordB.containsKey(entry.getKey())){
                int value = wordB.get(entry.getKey());
                if(entry.getValue() != value){
                    numberDeletions += Math.abs(entry.getValue() - value);
                }
            }else{
                numberDeletions += entry.getValue();
            }
            counted.put(entry.getKey(), 0);
        }
        for (HashMap.Entry<Character,Integer> entry : wordB.entrySet()) {
            if(!counted.containsKey(entry.getKey())){
                if(wordA.containsKey(entry.getKey())){
                    int value = wordA.get(entry.getKey());
                    if(entry.getValue() != value){
                        numberDeletions += Math.abs(entry.getValue() - value);
                    }
                }else{
                    numberDeletions += entry.getValue();
                }
            }
        }
        

        return numberDeletions;
    }
    public static void main(String[] args) {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        int result =  makeAnagram(a,b);
        System.out.println(result);
    }
}
