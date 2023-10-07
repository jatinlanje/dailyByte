package org.jatin.hashing;

import java.util.HashMap;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "Af";
        String stones = "AaaddfFf";
        System.out.println(numberOfJewelsStones(jewels,stones));
    }

    private static int numberOfJewelsStones(String jewels, String stones) {
        if(jewels.length()==0 || stones.length()==0){
            return 0;
        }
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<stones.length(); i++){
            map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);
        }
        for(int i=0; i<jewels.length(); i++){
            if(map.containsKey(jewels.charAt(i))){
                count+=map.get(jewels.charAt(i));
                map.remove(jewels.charAt(i));
            }
        }
        return count;
    }
}
