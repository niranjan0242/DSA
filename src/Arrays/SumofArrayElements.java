package Arrays;

public class SumofArrayElements {

    public int sum(int arr[], int n) {
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + arr[i];

        }
        return sum;

    }

    public static void main(String[] args) {
        SumofArrayElements sol = new SumofArrayElements();
        int arr[] = {1, 2, 3, 4, 6,8};
        int n = arr.length;
        System.out.println(sol.sum(arr, n));

    }


}



