class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;int right=0;
        int n=s.length();
        int ans=0;
        HashSet<Character> set = new HashSet<>();
        while(right<n){
            char c = s.charAt(right);
            //shrink the window until the duplicate character is removed.
            //Use example to know why while and not if here. s="pwwkew".
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans=Integer.max(ans,right-left+1);
            right++;
        }
    return ans;    
    }
}
