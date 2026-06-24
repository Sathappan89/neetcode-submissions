class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < n) {
            char c = s.charAt(right);
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
