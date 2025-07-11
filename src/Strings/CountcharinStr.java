package Strings;

public class CountcharinStr {
    public static int Countchar(String str){
        int cnt =0;
        for(int i = 0 ; i <=str.length()-1;i++){
            if(str.charAt(i)!=' ')
            cnt++;
        }
        return cnt;

    }
    public static void main(String[] args) {
        String input = "Niranjan Niri";
        System.out.println(Countchar(input));

    }
}
