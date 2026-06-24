class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
            // res[1]=res[1-1]*nums[1-1]; 1*1=1
            // res[2]=res[2-1]*nums[2-1]; 1*2=2
            // res[3]=res[3-1]*nums[3-1]; 2*4=8
        }
        // nums = [1,2,4,6]
        // res = [1,1,2,8]
        // postfix = 1
        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * postfix; // 8*1 = 8 ; 2*6=12 ; 24*1 = 24 ; 48*1=48
            postfix = postfix * nums[i]; // 1*6 = 6; 6*4=24; 24*2 = 48
        }
        return res;
    }
}
