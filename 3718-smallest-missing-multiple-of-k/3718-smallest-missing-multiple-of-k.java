class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int mul=k;
        int ans=k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==mul){
                ans=ans+k;
                mul=mul+k;
                System.out.println(ans+","+mul);
            }
        }
        return ans;
    }
}