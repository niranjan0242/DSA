package Arrays;
import java.util.*;
import java.io.*;

public class SumOfHighandLowFreq {

        public int sumHighestAndLowestFrequency(int[] nums) {
            int n = nums.length;
            int hfreq=0;
            int lfreq=Integer.MAX_VALUE;

            Map<Integer,Integer>map=new HashMap<>();

            for(int i =0;i<n;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+ 1);
            }

            for(Map.Entry<Integer,Integer>entry : map.entrySet()){
                int ele = entry.getKey();
                int freq = entry.getValue();

                hfreq=Math.max(hfreq,freq);
                lfreq=Math.min(lfreq,freq);
            }
            return hfreq + lfreq;
        }
        public static void main(String[]args){

            SumOfHighandLowFreq sol = new SumOfHighandLowFreq();
            int []nums = {1,1,2,2,2,3,3,3,3};
            System.out.println(sol.sumHighestAndLowestFrequency(nums));
        }
    }


