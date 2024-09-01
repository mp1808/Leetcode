class Solution {
    public int singleNumber(int[] nums) {
        // Arrays.sort();
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            h.put(nums[i], 0);
        }

        for (int y : h.keySet()) {
            for (int X : nums) {
                if (X == y) {
                    int an = h.get(X) + 1;
                    if (X == 4)
                        System.out.print(an);
                    h.put(X, an);
                }
            }
        }
        for (int X : h.keySet()) {
            if (h.get(X) == 1)
                return X;
        }
        return 0;
    }
}