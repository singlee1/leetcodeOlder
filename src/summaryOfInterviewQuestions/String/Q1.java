package summaryOfInterviewQuestions.String;

import org.junit.Test;

/**
 * @author singlee
 * @create 2020-10-23-22:01
 * 验证回文串
 */
public class Q1 {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while(l<r&&!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l<r&&!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(l<r){
                if(Character.toUpperCase(s.charAt(l))!=Character.toUpperCase(s.charAt(r))){
                    return false;
                }
                l++;
                r--;
            }

        }
        return true;
    }
    @Test
    public void test1(){
        boolean b= isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(b);
    }
}
