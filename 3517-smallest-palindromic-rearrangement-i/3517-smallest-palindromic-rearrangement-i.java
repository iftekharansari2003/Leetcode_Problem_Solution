class Solution {
    public String smallestPalindrome(String s) {

        int[] frq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        String middle = "";

        for (int i = 0; i < 26; i++) {
            if (frq[i] % 2 == 1) {
                middle = String.valueOf((char)(i + 'a'));
            }

            for (int j = 0; j < frq[i] / 2; j++) {
                left.append((char)(i + 'a'));
            }
        }

        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + middle + right;
    }
}