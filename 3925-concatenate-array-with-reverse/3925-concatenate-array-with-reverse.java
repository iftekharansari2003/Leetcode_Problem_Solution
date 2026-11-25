class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[]=new int[2*nums.length];

        int i=0;
        int j=0;
        while(j<nums.length){
            ans[i]=nums[j];
            i++;j++;
        }
        int k=nums.length-1;
        while(k>=0){
            ans[i]=nums[k];
            i++;k--;
        }
        return ans;
    }
}