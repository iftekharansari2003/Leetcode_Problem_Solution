class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n>0){
            int ld=n%10;
            arr.add(ld);
            n/=10;
        }
        
        Collections.sort(arr);
        return arr.get(arr.size()-1)*arr.get(arr.size()-2);
    }
}