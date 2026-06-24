class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            int len = strs.get(i).length();
            sb.append(len);
            sb.append('#');
            sb.append(strs.get(i));
        }
        return sb.toString();
    }
    // 5#Hello4#test
    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            ans.add(str.substring(i, i + len));
            i = i + len;
        }
        return ans;
    }
}