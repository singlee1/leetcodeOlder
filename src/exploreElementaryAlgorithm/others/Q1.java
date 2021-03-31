package exploreElementaryAlgorithm.others;

/**
 * @author singlee
 * @create 2020-08-08-10:20
 * 位 1 的个数
 */
public class Q1 {
    public int hammingWeight(int n) {
        int mask=1;     //位掩码
        int count=0;//统计个数

        for(int i=0;i<32;i++){  //32位有符号整数（java中没有无符号整数）
            if((n&mask)!=0){
                count++;
            }
            mask<<=1;       //左移一位
        }
        return count;
    }
}
