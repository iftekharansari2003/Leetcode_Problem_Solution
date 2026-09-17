class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;
        int[] best = new int[n];

        int INF = Integer.MAX_VALUE;
        int ans = INF;

        int left = 0;
        int sum = 0;
        int minLength = INF;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            while (sum > target) {
                sum -= arr[left++];
            }

            if (sum == target) {

                int currLength = right - left + 1;

                // Combine with a previous non-overlapping subarray
                if (left > 0 && best[left - 1] != INF) {
                    ans = Math.min(ans, currLength + best[left - 1]);
                }

                minLength = Math.min(minLength, currLength);
            }

            best[right] = minLength;
        }

        return ans == INF ? -1 : ans;
    }
}