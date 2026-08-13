class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        int i = 0;
        int ans = 0;

        for (int j = 0; j < nums.length; j++) {

            // Add nums[j] to window
            freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);

            // If frequency exceeds k, shrink from left
            while (freq.get(nums[j]) > k) {

                freq.put(nums[i], freq.get(nums[i]) - 1);

                if (freq.get(nums[i]) == 0) {
                    freq.remove(nums[i]);
                }

                i++;
            }

            // Current window = i ... j
            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}