class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
            int neededNumber = target - nums[i]; //7-3 =4 ; 7-4=3
            if(map.containsKey(neededNumber)){
                ans[0]=map.get(neededNumber);
                ans[1]=i;
                break;
            }
            else{
                map.put(nums[i],i); //3,0
            }
        }
    return ans;
    }
}
