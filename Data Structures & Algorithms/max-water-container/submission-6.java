class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int n = heights.length;
        int right = n - 1;
        int ans = 0;

        while (left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int area = height * width;
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
            ans = Math.max(ans, area);
        }
        return ans;
    }
}
