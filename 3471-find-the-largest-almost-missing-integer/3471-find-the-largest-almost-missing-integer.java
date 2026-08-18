class Solution {
    public int largestInteger(int[] nums, int k) {
        int ans=-1;
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i <= n - k; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            for (int x : set) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        for(int x : map.keySet()){
            if(map.get(x)==1){
                ans=Math.max(x,ans);
            }
        }
        return ans;
    }
}