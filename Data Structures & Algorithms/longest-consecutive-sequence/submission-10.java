class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentStreakLenght = 1;
                while (set.contains(num + currentStreakLenght)) {
                    currentStreakLenght++;
                }
                ans = Math.max(ans, currentStreakLenght);
            }
        }
        return ans;
    }
}
