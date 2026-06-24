class Solution {
    public int findMin(int[] nums) {
        int left=0,  n = nums.length ,  right = n-1;
        while(left<right){
            int mid = (right+left)/2;
            if(nums[mid]<nums[right]){
                right = mid;
            }else if(nums[mid]>=nums[right]){
                left = mid+1;
            }
        }
    return nums[left];
    }
}
