class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;int right=0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int ans =0;
        while(right<n){
            char c = s.charAt(right);
            
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            ans = Math.max(ans,right-left+1);
            right++;
        }
    return ans;
    }
}
