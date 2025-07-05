package Arrays;
import java.util.*;
import java.io.*;
public class SortedArray {
    boolean arraySortedOrNot(int[]arr,int n){
        for(int i =0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
               return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SortedArray sol = new SortedArray();
        int arr[] = {5,4,5,6,2,6};
        int n = arr.length;
        System.out.println(sol.arraySortedOrNot(arr,n));
        }
    }

