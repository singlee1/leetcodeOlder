package exploreElementaryAlgorithm.others;

import java.util.*;

/**
 * @author singlee
 * @create 2020-08-19-21:59
 * 有效的括号
 */
public class Q5 {



    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }

        //创建一个Map
        Map<Character,Character> map=new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');

        Deque<Character> stack=new LinkedList<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(map.containsKey(c)){     //该字符是否是右括号
                if(stack.isEmpty()||stack.peek()!=map.get(c)){
                    return false;
                }
            stack.pop();
            }else {
                stack.push(c);
            }

        }
        return stack.isEmpty();
    }
}
