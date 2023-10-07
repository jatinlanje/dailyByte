package org.jatin.hashing;

import java.util.HashMap;
import java.util.Map;

public class SpotTheDifference {
    public static void main(String[] args) {
        String s1 = "foobar";
        String s2 = "barfoot";
        System.out.println(spotTheDifference(s1,s2));
    }

    private static Character spotTheDifference(String s1, String s2) {
        if (s1.length()==0 || s2.length()==0){
            return ' ';
        }
        Map<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        }
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<s2.length(); i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
        for (int i=0; i<s2.length(); i++){
            if(map1.containsKey(s2.charAt(i))!=map2.containsKey(s2.charAt(i))){
                return s2.charAt(i);
            }
        }
        return ' ';
    }
}
