package Strings;
import java.util.*;
import java.io.*;

public class ScoreofaString {
    public int scoreOfString(String s){
        int score = 0;
        for(int i=0;i<s.length()-1;i++){
            score += (int)Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return score;
    }

    public static void main(String[] args) {
        ScoreofaString sol = new ScoreofaString();
        String s = "zaz";
        System.out.println(sol.scoreOfString(s));
    }
}
