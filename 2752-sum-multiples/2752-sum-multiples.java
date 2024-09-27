class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        int i = 1;

        while (i <= n) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
            i++;
        }

        return sum;  // Return the computed sum
    }

    public static void main(String[] args) {
        Solution s = new Solution();  // Create an instance of Solution
        int n1 = s.sumOfMultiples(7);  // Call the method with 7
        System.out.println(n1);  // Print the result
    }
}
