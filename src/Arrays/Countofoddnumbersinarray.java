package Arrays;
import java.util.*;
import java.io.*;
public class Countofoddnumbersinarray {
    public int countOdd(int[]arr,int n){
        int cnt=0;
        for(int i = 0 ; i<n;i++){
            if(arr[i]%2==1){
                cnt = cnt +1;

            }
        }
        return cnt;

    }

    public static void main(String[] args) {
        Countofoddnumbersinarray sol = new Countofoddnumbersinarray();
        int arr[]= {1,2,3,4,5};
        int n = arr.length;
        System.out.println(sol.countOdd(arr,n));
    }

}
