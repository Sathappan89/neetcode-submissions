class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0;
        int n = s.length();
        int maxFreq = 0;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < n) {
            char c = s.charAt(right);
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));
            while ((right - left + 1) - maxFreq > k) {
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }
            ans = Math.max(ans,right-left+1);
            right++;
        }
    return ans;
    }
}
