package Arrays;
import java.util.*;
import java.io.*;
public class SecondHighestOccuringEle {

        public int secondMostFrequentElement(int[] nums) {
            int maxEle=0;
            int secmaxEle=0;
            int maxFreq=0;
            int secmaxFreq=0;
            int n = nums.length;
            Map<Integer,Integer>map=new HashMap<>();

            for(int i =0;i<n;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }

            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                int ele =entry.getKey();
                int freq = entry.getValue();

                if(freq>maxFreq){
                    secmaxFreq=maxFreq;
                    maxFreq=freq;
                    secmaxEle=maxEle;
                    maxEle=ele;
                } else if(freq==maxFreq){
                    maxEle=Math.min(maxEle,ele);
                } else if(freq>secmaxFreq){
                    secmaxFreq=freq;
                    secmaxEle=ele;
                }else if(freq==secmaxFreq){
                    secmaxEle=Math.min(secmaxEle,ele);
                }

            }

            return secmaxEle;
        }
        public static void main(String[]args){
            SecondHighestOccuringEle sol = new SecondHighestOccuringEle();
            int []nums={1,3,2,1,2,3,2,4,4,5,6,6,6};
            System.out.println(sol.secondMostFrequentElement(nums));
        }
    }



