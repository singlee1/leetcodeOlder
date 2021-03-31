package exploreElementaryAlgorithm.string;

import java.util.Arrays;

/**
 * @author singlee
 * @create 2020-04-20-16:10
 *  有效的字母异位词
 */
public class Q4 {
    public boolean isAnagram(String s, String t) {
        char[]  sc=s.toCharArray();
        char[]  tc=t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        if(Arrays.equals(sc,tc))   return true;
        else return false;
    }
}
