class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = n - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (nums[mid] >= nums[right]) {
                left++;
            } else if (nums[mid] < nums[right]) {
                right--;
            }
        }
        return nums[left];
    }
}
