class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int ans=0;
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        for (int num : set) {
            if(!set.contains(num-1)){
                int currentStreakLength =1;
                while(set.contains(num+currentStreakLength)){
                    currentStreakLength++;
                }
            ans = Math.max(ans,currentStreakLength);
            }
        }
    return ans;
    }
}
