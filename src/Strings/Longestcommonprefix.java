package Strings;
import java.util.*;
public class Longestcommonprefix {
    public static String lcp(String[] arr){
   Arrays.sort(arr);
   String first = arr[0];
   String last = arr[arr.length-1];
   int i =0;
   while(i<first.length()&&i<last.length()){
       if(first.charAt(i)==last.charAt(i)){
           i++;
       } else {
           break;
       }
   }
   return first.substring(0,i);
    }
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(
                lcp(arr));
    }
}
