package valid_parentheses;

import java.util.Stack;

public class ValidParentheses {

    //this solution is wrong : test s="()[]{}" should return true
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        char[] sChars = s.toCharArray();
        for (char sChar : sChars) {
            char currentChar = stack.pop();
            if (sChar == '(') {
                if (currentChar != ')') {
                    isValid = false;
                    break;
                }
            }

            if (sChar == '{') {
                if (currentChar != '}') {
                    isValid = false;
                    break;
                }
            }

            if (sChar == '[') {
                if (currentChar != ']') {
                    isValid = false;
                    break;
                }
            }
        }
        return isValid;
    }
}
