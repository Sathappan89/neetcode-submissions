class Solution {
    public int characterReplacement(String s, int k) {
        int left=0, right=0, n=s.length(), maxFreq=0, ans =0; 
        HashMap<Character,Integer> map = new HashMap<>();
        while(right<n){
            char ch = s.charAt(right);
            map.putIfAbsent(ch,0);
            map.put(ch,map.get(ch)+1);
            maxFreq = Integer.max(maxFreq,map.get(ch));


            while(((right-left+1)-maxFreq)>k){
                char c = s.charAt(left);
                map.put(c,map.get(c)-1);
                left++;
            }

            ans = Integer.max((right-left+1),ans);
            right++;
        }
    return ans;
    }
}
