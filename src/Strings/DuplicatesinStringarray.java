package Strings;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class DuplicatesinStringarray {
    public static boolean duplicates(String[] str){
        Map<String,Integer>map=new HashMap<>();
        for(String word:str){
            map.put(word,map.getOrDefault(word,0)+1);

        }
        boolean hasDuplicates = false;

        for(Map.Entry<String,Integer> it: map.entrySet()){
            if((it.getValue())>1){
                System.out.println(it.getKey());
                hasDuplicates=true;
            }
        }
        System.out.println("has duplicate:");
        return hasDuplicates;
    }
    public static void main(String[] args) {
        String[] s ={"apple","banana","orange","Mango","apple","Mango"};

        System.out.println(duplicates(s));
    }
}
