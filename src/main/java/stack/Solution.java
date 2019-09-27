package stack;

import java.util.HashMap;
import java.util.Stack;

class Solution {

    HashMap<Character, Character> map = null;

    public Solution(){
        map = new HashMap<>();
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');
    }
    public static void main(String[] args) {
        String s = "((()(()))){}[]";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }

    private boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(this.map.containsKey(c)){

                char topElement = stack.isEmpty() ? '#':stack.pop();
                if(topElement != this.map.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
