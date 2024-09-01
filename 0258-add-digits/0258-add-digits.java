class Solution {
    public int addDigits(int num) {
        int sum=0;
        int n=num;
        while(n>9){
            sum=0; 
           while(n!=0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
           }
           n=sum;
        }
        return n;
    }
}