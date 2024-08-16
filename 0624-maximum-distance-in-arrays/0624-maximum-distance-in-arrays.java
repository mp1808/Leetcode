class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0), max = arrays.get(0).get(arrays.get(0).size() - 1);

        int maxDist = Integer.MIN_VALUE;

        for (int i = 1; i < arrays.size(); i++) {
            int curMax = arrays.get(i).get(arrays.get(i).size() - 1);
            int curMin = arrays.get(i).get(0);

            maxDist = Math.max(maxDist, Math.abs(max - curMin));
            maxDist = Math.max(maxDist, Math.abs(min - curMax));

            max = Math.max(curMax, max);
            min = Math.min(curMin, min);
        }

        return maxDist;
    }
}