class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 3, 4 , 5 ,6 target = 7
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for (int i = 0; i < n; i++) {
            int sum = target - nums[i]; // 7-3 = 4 ; 7-4 = 3
            if (map.containsKey(sum)) {
                ans[0] = map.get(sum); // 0
                ans[1] = i;
                break;
            } else {
                map.put(nums[i], i); // 3,0
            }
        }
        return ans;
    }
}
