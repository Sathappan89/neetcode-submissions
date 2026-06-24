class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            //SKIP Duplicates for i
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = n-1;
            int target = -1*nums[i];

            while(left<right){
                int sum = nums[left]+nums[right];
                if(sum==target){
                    ans.add(Arrays.asList(nums[i],nums[right],nums[left]));
                    left++;
                    right--;
                    //SKIP Duplicates for left
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    //SKIP Duplicates for right
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
    return ans;
    }
}
