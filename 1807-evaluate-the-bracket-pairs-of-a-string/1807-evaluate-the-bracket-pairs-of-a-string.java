class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < knowledge.size(); i++) {
            List<String> arr = knowledge.get(i);
            map.put(arr.get(0), arr.get(1));
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) != '(') {
                sb.append(s.charAt(i));
                i++;
            } else {
                int end = s.indexOf(')', i);
                String key = s.substring(i + 1, end);
                sb.append(map.getOrDefault(key, "?"));
                i = end + 1;
            }
        }

        return sb.toString();
    }
}