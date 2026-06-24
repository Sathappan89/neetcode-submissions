class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
        int ans=0;

        while(left<right){
            int height = Integer.min(heights[left],heights[right]);//1,6=1
            int width = right-left;//7
            int area = height*width;//7
            ans = Integer.max(ans,area);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
    return ans;
    }
}
