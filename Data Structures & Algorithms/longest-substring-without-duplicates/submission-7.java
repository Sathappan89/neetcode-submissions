class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int left = 0;
        int right = 0;
        int ans = 0;
        while (right < n) {
            char c = s.charAt(right);
            // shrink the window
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
