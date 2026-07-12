class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
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
                    ans = Math.max(currentStreakLength, ans);
            }
        }
        return ans;
    }
}
