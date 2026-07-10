class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            int neededNumber = target - nums[i];
            if (map.containsKey(neededNumber)) {
                ans[0] = map.get(neededNumber);
                ans[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        } return ans;
    }
}
