class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            int numberNeeded = target - nums[i];
            if (map.containsKey(numberNeeded)) {
                ans[0] = map.get(numberNeeded);
                ans[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
