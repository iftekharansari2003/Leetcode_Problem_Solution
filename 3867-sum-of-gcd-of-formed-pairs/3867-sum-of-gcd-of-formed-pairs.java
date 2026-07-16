class Solution {
    public long gcdSum(int[] nums) {
        int prefixgcd[]=new int[nums.length];
        int max=0;

        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            int a=max;
            int b=nums[i];
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            prefixgcd[i]=a;
        }
        Arrays.sort(prefixgcd);

       long ans=0;
       int si=0;
       int ei=nums.length-1;

       while(si<ei){
        int a=prefixgcd[si];
        int b=prefixgcd[ei];
         while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            ans+=a;
            si++;
            ei--;

       }
       return ans;
    }
}