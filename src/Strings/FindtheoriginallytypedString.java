package Strings;

public class FindtheoriginallytypedString {
    public int possibleStringCount(String s){
        int pos =1;
        for(int i =1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                pos+=1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        FindtheoriginallytypedString sol = new FindtheoriginallytypedString();
        String s = "abbcccc";
        System.out.println(sol.possibleStringCount(s));
    }
}
