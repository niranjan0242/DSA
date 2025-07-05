package Arrays;
import java.util.*;
import java.io.*;
public class ConcatenationOfArray {
    public int[] getConcatenation(int nums[]){
        int ans[]=new int[nums.length*2];
        for(int i =0;i<nums.length*2;i++){
            if(i<nums.length){
                ans[i]=nums[i];

            }
            else{
                ans[i]=nums[i-nums.length];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ConcatenationOfArray sol = new ConcatenationOfArray();
        int nums[]={1,3,4,5};
        System.out.println(Arrays.toString(sol.getConcatenation(nums)));
    }
}
