package exploreElementaryAlgorithm.string;

/**
 * @author singlee
 * @create 2020-04-20-17:11
 * 验证回文字符串
 */
public class Q5 {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^0-9a-z]","");
        char[] cs=s.toCharArray();
        int i=0,j=cs.length-1;
        while (i<j){
            if(cs[i]!=cs[j])    return false;
            i++;
            j--;
        }

        return true;
    }
}
