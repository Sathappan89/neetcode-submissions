class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int ans = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < n) {
            char ch = s.charAt(right);
            // Step 1: Add right char to map
            map.putIfAbsent(ch, 0);
            map.put(ch, map.get(ch) + 1);
            // Step 2: Track highest frequency char in window
            maxFreq = Math.max(maxFreq, map.get(ch));
            // Step 3: If window invalid → shrink from left
            while (((right - left + 1) - maxFreq) > k) {
                char c = s.charAt(left);
                map.put(c, map.get(c) - 1);
                left++;
            }
            // Step 4: Window is valid → update answer
            ans = Math.max((right - left + 1), ans);
            right++;
        }
        return ans;
    }
}
