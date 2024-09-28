class Solution {
    public int differenceOfSum(int[] nums) {
        int t=0,k=0;
        for(int i=0;i<nums.length;i++){
                   t=t+nums[i];
                   int b=nums[i];
                   while(b!=0){
                    int r=b%10;
                    k=k+r;
                    b=b/10;
                   }

        }
        return Math.abs(k-t);
    }
}