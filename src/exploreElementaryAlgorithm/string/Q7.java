package exploreElementaryAlgorithm.string;

/**
 * @author singlee
 * @create 2020-04-22-20:16
 * 实现 strStr()
 */
public class Q7 {
    public int strStr(String haystack, String needle) {
        int l=needle.length();
        int n=haystack.length();
        for(int i=0;i<n-l+1;i++){
            if(haystack.substring(i,i+l).equals(needle)){
                return i;
            }
        }


        return -1;
    }

}
