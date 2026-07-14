class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String ch = operations[i];
            if (ch.equals("+")) {
                int top = stack.pop();
                int sum = top + stack.peek();
                stack.push(top);
                stack.push(sum);
            } else if (ch.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (ch.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(ch));
            }
        }

        int total = 0;
        for (int i = 0; i < stack.size(); i++) {
            total = total + stack.get(i);
        }
        return total;
    }
}