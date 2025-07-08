package Arrays;
import java.util.*;
import java.io.*;

public class HighestOccuringArrayElement {

        public int mostFrequentElement(int[] nums) {
            int n = nums.length;
            int maxFreq= 0;
            int maxEle = 0;

            Map<Integer,Integer> mpp = new HashMap<>();

            for(int i =0;i<n;i++){
                mpp.put(nums[i],mpp.getOrDefault(nums[i],0) + 1);
            }

            for(Map.Entry<Integer,Integer>  entry : mpp.entrySet()) {
                int ele = entry.getKey();
                int freq = entry.getValue();
                if(freq>maxFreq){
                    maxFreq=freq;
                    maxEle= ele;

                } else if (freq==maxFreq) {
                    maxEle= Math.min(maxEle,ele);
                }
            }
            return maxEle;
        }
        public static void main(String[]args){
            HighestOccuringArrayElement  sol= new HighestOccuringArrayElement ();
            int []nums = {4,4,5,5,5,5,5,6,6};
            System.out.println(sol.mostFrequentElement(nums));
        }
    }





