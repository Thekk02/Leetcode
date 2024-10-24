package solution;

import java.util.*;

/**
 * @author kk
 * @description 有效的括号
 * @date 2024-10-24 11:45:24
 */
public class sln20 {
    public boolean isValid(String s) {
        int n = s.length();
        if(n % 2 == 1){
            return false;
        }
        Map<Character,Character> pairs = new HashMap<Character,Character>(){{
            put(')','(');
            put(']','[');
            put('}','{');
        }};
        Deque<Character> stack = new LinkedList<>();
        for(int i = 0;i < n;i++){
            char ch = s.charAt(i);
            if(pairs.containsKey(ch)){
                if(stack.isEmpty() || stack.peek() != pairs.get(ch)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
