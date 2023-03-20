package easy;

import java.util.Stack;

public class ValidParentheses_20 {

    public static void main(String[] args) {

        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            switch (c){
                case '(' :
                    stack.push(')');
                    break;
                case '{' :
                    stack.push('}');
                    break;
                case '[' :
                    stack.push(']');
                    break;
                default:
                    if(stack.isEmpty() || c != stack.pop()){
                        return false;
                    }
            }
        }

        return stack.isEmpty();
    }
}
