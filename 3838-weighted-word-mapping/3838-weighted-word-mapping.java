class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder("");

        char arr[]=new char[26];
        int p=25;
        for(char i='a';i<='z';i++){
            arr[p--]=i;
        }

        for(int i=0;i<words.length;i++){
            String word=words[i];
            int weight=0;
            for(int j=0;j<word.length();j++){
                weight+=weights[word.charAt(j)-'a'];
            }
            sb.append(arr[weight%26]);
        }
        
        return sb.toString();
    }
}