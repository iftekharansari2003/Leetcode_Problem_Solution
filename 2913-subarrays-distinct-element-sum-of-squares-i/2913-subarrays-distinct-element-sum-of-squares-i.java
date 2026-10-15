class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            int start=i;
            for(int j=i;j<nums.size();j++){
                int end=j;
                HashSet<Integer>hs=new HashSet<>();
                for(int k=start;k<=end;k++){
                    hs.add(nums.get(k));
                }
                ans+=hs.size()*hs.size();
            }
        }
        return ans;
    }
}