package Strings;

public class DeleteAChar {
    public static String remove(String str,int index){
        return (str.substring(0,index) + str.substring(index+1));

    }
    public static void main(String[] args) {

        String input = "bannana";
        int Index = 322;
        System.out.println(remove(input,Index));

    }
}
