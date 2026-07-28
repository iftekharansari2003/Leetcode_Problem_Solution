class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=nums[n-1];
        int secmax=nums[n-2];
        int thirdmax=nums[n-3];

        int min=nums[0];
        int secmin=nums[1];

        return Math.max((max*secmax*thirdmax),(min*secmin*max));

    }
}