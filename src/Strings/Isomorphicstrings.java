package Strings;

public class Isomorphicstrings {
    public static boolean iso(String a , String b){
        if(a.length()!=b.length()){
            return false;
        }
        for(int i = 0 ;i<a.length();i++){
            char c1 =a.charAt(i);
            char c2 =b.charAt(i);
            for(int j =0;j<a.length();j++){
                if(a.charAt(j)==c1 && b.charAt(j)!=c2){
                    return false;
                } else if(b.charAt(j)==c2 && a.charAt(j)!=c1){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "aab";
        String t = "xzy";
        System.out.println(iso(s,t));
    }
}

