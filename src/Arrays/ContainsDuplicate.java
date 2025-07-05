package Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[]nums){
        int n = nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
        }
        if(cnt==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();
        int nums[]={1,1,3,4,5,6};
        System.out.println(sol.containsDuplicate(nums));
    }
}
