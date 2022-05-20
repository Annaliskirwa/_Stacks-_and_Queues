import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        //initialize the stack
        Stack<Character> sta = new Stack<Character>();
        
        //loop through the string
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                sta.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && !sta.isEmpty() && sta.peek() == '(') {
                sta.pop();
            } else if(s.charAt(i) == '}' && !sta.isEmpty() && sta.peek() == '{') {
                sta.pop();
            } else if(s.charAt(i) == ']' && !sta.isEmpty() && sta.peek() == '[') {
                sta.pop();
            } else {
                return false; 
            }
        }
        return sta.isEmpty();
        
    }
}