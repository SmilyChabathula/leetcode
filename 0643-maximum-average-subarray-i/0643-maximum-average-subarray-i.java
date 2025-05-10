class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxSum = 0;

        // Calculate sum of first 'k' elements
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double currentSum = maxSum;

        // Sliding window: move through the array
        for (int i = k; i < n; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum / k;
    }
}
