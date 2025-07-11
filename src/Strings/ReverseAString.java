package Strings;
import java.util.*;
import java.io.*;
public class ReverseAString {
    public static String reversedstring(String str){
       char[] chr = str.toCharArray();
       int left = 0;
       int right =chr.length-1;
       while(left<right){
           char temp = chr[left];
           chr[left]= chr[right];
           chr[right]= temp;
           left++;
           right--;
       }
       return new String(chr);
    }
    public static void main(String[] args) {
        String input = "netradyne";
        System.out.println(reversedstring(input));

    }
}
