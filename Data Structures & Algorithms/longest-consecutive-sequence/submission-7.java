class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int ans = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentStreakNumber = 1;
                while (set.contains(num + currentStreakNumber)) {
                    currentStreakNumber++;
                }
                ans = Math.max(ans, currentStreakNumber);
            }
        }
    return ans;
    }
}
