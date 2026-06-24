class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int ans=0;
        HashSet<Character> set = new HashSet<Character>();
        int n = s.length();

       while(right<n){
        char c = s.charAt(right);
            //Shrink the window until the duplicate character is removed.
            //use example to know why while and not if here 
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
        set.add(c);
        ans = Integer.max(ans,right-left+1);
        right++;
       }
    return ans;
    }
}
