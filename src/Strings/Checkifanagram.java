package Strings;
import java.util.*;
import java.io.*;
public class Checkifanagram {
    public static boolean anagram(String str1,String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr1.length != arr2.length) {
            return false;
        }
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String one = "monkey";
        String two = "yeknom";
        System.out.println(anagram(one,two));
    }
}
