class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0;
        int n = s.length();
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        while (right < n) {
            char c = s.charAt(right);
            map.putIfAbsent(c,0);
            map.put(c, map.get(c) + 1);
            maxFreq =  Integer.max(maxFreq, map.get(c));
            //This is the replacements needed -> (right - left + 1) - maxFreq 
            //That is , “Everything except the majority character must be replaced.”, 
            //Because the goal of the problem is: Make all characters in the current window the same.
            while ( (right - left + 1) - maxFreq > k) {
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
