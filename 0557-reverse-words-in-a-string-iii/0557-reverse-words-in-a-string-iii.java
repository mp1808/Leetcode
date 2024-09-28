class Solution {
    public String reverseWords(String s) {
        String []h=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String x:h){
            StringBuilder b=new StringBuilder(x);
        sb.append(b.reverse());
        sb.append(" ");
        }
        return sb.toString().trim();
        
    }
}