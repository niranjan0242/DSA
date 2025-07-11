package Strings;
import java.util.*;
public class Nonrepeatingletter {
    public static char firstnonrepeating(String str){
        Map<Character,Integer>map= new LinkedHashMap<>();

        for(int i = 0;i<=str.length()-1;i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer>it : map.entrySet()){
            if((it.getValue())==1){
                return it.getKey();
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String s = "Niei";
        System.out.println(firstnonrepeating(s));

    }
}
