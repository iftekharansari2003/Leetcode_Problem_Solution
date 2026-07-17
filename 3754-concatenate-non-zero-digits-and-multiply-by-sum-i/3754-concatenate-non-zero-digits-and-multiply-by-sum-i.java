class Solution {
    public long sumAndMultiply(int num) {
        String s = String.valueOf(num);
        int x=0;
        long sum=0;
    for (int i = 0; i < s.length(); i++) {
        int digit = s.charAt(i) - '0';
        if(digit>0){
            x=x*10+digit;
            sum+=digit;
        }
    }
    return sum*x;
    }
}