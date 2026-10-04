class Solution {
    public int thirdMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        int thirdmax=Integer.MIN_VALUE;

        HashSet<Integer> hs =new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
            if(nums[i]>max){
                thirdmax=secmax;
                secmax=max;
                max=nums[i];
            }
            else if(nums[i]>secmax){
                thirdmax=secmax;
                secmax=nums[i];
            }
            else if(nums[i]>thirdmax){
                thirdmax=nums[i];
            }
            hs.add(nums[i]);
            }

        }
        if(hs.size()<3){
            return max;
        }
        else{
            return thirdmax;
        }
    }
}