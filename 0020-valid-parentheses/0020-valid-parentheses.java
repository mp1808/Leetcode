import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> sb = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                sb.push(')');
            } else if (c == '{') {
                sb.push('}');
            } else if (c == '[') {
                sb.push(']');
            } else if (sb.isEmpty() || sb.pop() != c) {
                return false;
            }
        }
        return sb.isEmpty();
    }
}
