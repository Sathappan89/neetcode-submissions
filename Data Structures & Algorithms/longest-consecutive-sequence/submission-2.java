class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<Integer>();
            int ans=0;
            int n=nums.length;
                for(int i=0;i<n;i++){
                    set.add(nums[i]);
                }

        for(int num: set){
            if(set.contains(num-1)!=true){
                int currentStreakLength=1;
                    while(set.contains(num+currentStreakLength)){
                        currentStreakLength++;
                    }
                ans = Integer.max(currentStreakLength,ans);
            }
        }
    return ans;
    }
}