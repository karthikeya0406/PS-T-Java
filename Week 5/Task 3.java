public static List<Integer> maxSubarray(List<Integer> arr) {
    int maxSubarray = arr.get(0);
    int currentSum = arr.get(0);

    int maxSubsequence = 0;
    int maxElement = arr.get(0);

    for (int i = 0; i < arr.size(); i++) {
        int val = arr.get(i);

        // Kadane's algorithm for subarray
        if (i > 0) {
            currentSum = Math.max(val, currentSum + val);
            maxSubarray = Math.max(maxSubarray, currentSum);
        }

        // Subsequence logic
        if (val > 0) {
            maxSubsequence += val;
        }

        maxElement = Math.max(maxElement, val);
    }

    // If all elements are negative
    if (maxSubsequence == 0) {
        maxSubsequence = maxElement;
    }

    return Arrays.asList(maxSubarray, maxSubsequence);
}