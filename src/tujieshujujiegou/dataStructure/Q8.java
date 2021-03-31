package tujieshujujiegou.dataStructure;

/**
 * @author singlee
 * @create 2021-02-18-21:57
 * 剑指 Offer 58 - II. 左旋转字符串
 */
public class Q8 {

    public String reverseLeftWords(String s, int n) {

        //法1：拼接
        return s.substring(n,s.length())+s.substring(0,n);




    }
}
