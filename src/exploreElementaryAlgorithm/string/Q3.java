package exploreElementaryAlgorithm.string;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author singlee
 * @create 2020-04-18-21:22
 * 字符串中的第一个唯一字符
 */
public class Q3 {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> count=new HashMap<>();
        for(int i=0;i<s.length();i++){
            count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(count.get(s.charAt(i))==1) return i;
        }

        return -1;
    }
}
