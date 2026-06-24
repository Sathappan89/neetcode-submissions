class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("+")) {
                int top = stack.pop();
                int sum = top + stack.peek();
                stack.push(top);
                stack.push(sum);
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        for (int i = 0; i < stack.size(); i++) {
            total = total + stack.get(i);
        }
        return total;
    }
}