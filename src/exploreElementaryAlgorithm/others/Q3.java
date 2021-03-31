package exploreElementaryAlgorithm.others;

/**
 * @author singlee
 * @create 2020-08-11-23:36
 * 颠倒二进制位
 */
public class Q3 {


    public int reverseBits(int n) {
        int res=0;

        for(int i=0;i<32;i++){
            res=(res<<1)+(n&1);
            n=n>>1;
        }
    return res;
    }
}
