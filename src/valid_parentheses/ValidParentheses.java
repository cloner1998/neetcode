package valid_parentheses;

import java.util.Stack;

public class ValidParentheses {

    //this solution is wrong : test s="()[]{}" should return true
    public static boolean isValid_wrong(String s) {
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

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.isEmpty() || s.length() == 1) {return  false;}
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{') {
                stack.push('{');
            }
            else if (s.charAt(i) == '[') {
                stack.push('[');
            }
            else if (s.charAt(i) == '(') {
                stack.push('(');
            }

            else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                else if (stack.pop() != '(') {
                    return false;
                }
            }
            else if (s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                else if (stack.pop() != '[') {
                    return false;
                }
            }
            else if (s.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                else if (stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // this is official solution
    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        java.util.Map<Character, Character> closeToOpen = new java.util.HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
