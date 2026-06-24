class Solution {
    public int longestConsecutive(int[] nums) {
     Set<Integer> set = new HashSet<Integer>();
     int n = nums.length;
     int ans=0;
     for(int i=0;i<n;i++){
        set.add(nums[i]);
     }
     for(int num: set){
        if(set.contains(num-1)!=true){
            int curentStreakLength = 1;
                while(set.contains(num+curentStreakLength)){
                    curentStreakLength++;
                }
            ans=Integer.max(curentStreakLength,ans);
            }
        }
        return ans;
    }
}