class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int height = Math.min(heights[left],heights[right]);
            int width = right - left;
            int area = height * width;
            ans = Math.max(ans, area);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
    return ans;
    }
}
