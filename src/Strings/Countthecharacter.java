package Strings;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
public class Countthecharacter {
    public static int counting(String str,char ch){
        int cnt =0;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)==ch){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String input = "mynameisniranjanniri";
        char ch='s';
        System.out.println(counting(input,ch));
    }
}
