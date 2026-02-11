class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;

        int maxKadane = nums[0];
        int currentMax = nums[0];

        int minKadane = nums[0];
        int currentMin = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            totalSum += val;

            if (i > 0) {
                currentMax = Math.max(val, currentMax + val);
                maxKadane = Math.max(maxKadane, currentMax);

                currentMin = Math.min(val, currentMin + val);
                minKadane = Math.min(minKadane, currentMin);
            }
        }

        // If all numbers are negative, totalSum == minKadane
        if (totalSum == minKadane) {
            return maxKadane;
        }

        return Math.max(maxKadane, totalSum - minKadane);
    }
}