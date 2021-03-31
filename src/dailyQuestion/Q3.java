package dailyQuestion;

import org.junit.Test;

/**
 * @author singlee
 * @create 2021-03-02-23:17
 * 回文字符串
 */
public class Q3 {
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) {
                //注意l++和l+1的区别
                return isPalindrome(s, l+1, r) || isPalindrome(s, l, r-1);
            }
            l++;
            r--;
        }
/*        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }*/

    return true;
    }
    public boolean isPalindrome(String s,int l, int r){
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }
        return true;
    }

    @Test
    public void test(){
       String s= "cbbcc";

        System.out.println(validPalindrome(s));
    }
}
