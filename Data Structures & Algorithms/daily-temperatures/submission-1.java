class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] results = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                int lowerTempidx = stack.pop();
                results[lowerTempidx] = i - lowerTempidx;
            }
            stack.push(i);
        }
        return results;
    }
}
