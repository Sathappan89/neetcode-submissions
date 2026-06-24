class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
            int left=0, right = n-1;
                while(left<right){
                    int mid = (left+right)/2;
                    if(nums[mid]>=nums[right]){
                        left=mid+1;
                    }else if(nums[mid]<nums[right]){
                        right=mid;
                    }
                }
        int pivot = left;
         left = 0;
         right = n-1;

        if(nums[pivot]<=target && target<=nums[right]){
            left = pivot;
        }else{
            right=pivot-1;
        }   

        int ans = binarySearch(nums, left, right, target);
        return ans;
    }

    public int binarySearch(int[] nums, int left, int right,int target){
        while(left<=right){
            int mid = (right+left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                left = mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }
        }
    return -1;
    }
}
