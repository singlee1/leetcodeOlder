package exploreElementaryAlgorithm.string;

/**
 * @author singlee
 * @create 2020-04-18-20:24
 * 反转字符串
 */
public class Q1 {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char c;
            c=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=c;
        }
    }
}
