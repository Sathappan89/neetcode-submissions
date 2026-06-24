class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] ans = new int[2];

        for(int i=0;i<nums.length;i++){
            int neededinput = target-nums[i]; //7-4 =3 ; //7-3=4
            if(map.containsKey(neededinput)){
                ans[0]=map.get(neededinput); //0
                ans[1]=i; //1
                break;
            }else{
                map.put(nums[i],i);
            }
        }
    return ans;
    }
}
