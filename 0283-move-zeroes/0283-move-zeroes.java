class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int m=0;
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
               if(nums[i]!=0){
                ar[m]=nums[i];
                m++;
               }
        
        }
        for(int i=0;i<n;i++){
            nums[i]=ar[i];
        }
    }
}