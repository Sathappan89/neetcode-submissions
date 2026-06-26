class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty() ? true : false;
    }
}
