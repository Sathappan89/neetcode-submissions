class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int ans = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentStreakLength = 1;
                while (set.contains(num + currentStreakLength)) {
                    currentStreakLength++;
                }
                ans = Math.max(ans, currentStreakLength);
            }
        }
        return ans;
    }
}
