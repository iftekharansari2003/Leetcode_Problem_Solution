class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int weight=0;
            for(int j=0;j<word.length();j++){
                weight+=weights[word.charAt(j)-'a'];
            }
            char ch = (char) ('z' - (weight % 26));
            sb.append(ch);
        }
        
        return sb.toString();
    }
}