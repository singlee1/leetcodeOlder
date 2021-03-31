package dailyQuestion;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author singlee
 * @create 2021-03-01-21:22
 * 反转字符串中的元音字符
 */
public class Q2 {
    public String reverseVowels(String s) {
        if(s==null) return null;
        HashSet<Character> set=new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] rst=new char[s.length()];
        int l=0,r=s.length()-1;
        while(l<=r){
            char cl=s.charAt(l);
            char cr=s.charAt(r);
            if(!set.contains(cl)){
                rst[l++]=cl;
            }else if(!set.contains(cr)){
                rst[r--]=cr;
            }else {
                rst[l++]=cr;
                rst[r--]=cl;
            }

        }

    return new String(rst);
    }

    @Test
    public void test(){
        String s="leetcode";
        System.out.println(reverseVowels(s));

    }

}
