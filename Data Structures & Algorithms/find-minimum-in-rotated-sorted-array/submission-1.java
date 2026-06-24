class Solution {
    public int findMin(int[] nums) {
        
        int left = 0, right = nums.length - 1;
        while(left < right) {
            int mid = (right + left ) /2;
            if (nums[mid] >= nums[right]) {
                // Safe midpoint calculation to prevent integer overflow
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                // The minimum element must be to the right of mid
                right = mid;
            }else {
                // Handle duplicate elements (Optional, but makes it robust)
                right--; 
            }
        }
        return nums[left];
    }
}
