class Solution {
    public boolean isValid(String s) {
        int n = s.length();
            Stack<Character> stack = new Stack<>();
                for(int i=0;i<n;i++){
                    char c = s.charAt(i);
                    
                    if(c == '(' || c == '{' || c == '['){
                        stack.push(c);
                    }else if( c == '}' && !stack.empty() && stack.peek() == '{'){
                        stack.pop();
                    }else if( c == ')' && !stack.empty() && stack.peek() == '('){
                        stack.pop();
                    }else if( c == ']' && !stack.empty() && stack.peek() == '['){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
        return stack.empty() ? true : false;
    }
}
