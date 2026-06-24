class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0,ans=0;
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        while (right < n) {
            char c = s.charAt(right);
            // KEY : Shrink window until duplicate is removed
            while (set.contains(c)) { // Fixed: was set.contains(right)
                set.remove(s.charAt(left)); // Remove leftmost character
                left++; // Shrink from left
            }
            set.add(c); // Add new unique char
            ans = Math.max(ans, right - left + 1); // Update max window size
            right++; // Expand right
        }
    return ans;
    }
}
