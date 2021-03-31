package exploreElementaryAlgorithm.Math;

/**
 * @author singlee
 * @create 2020-08-04-11:23
 * 3的幂
 */
public class Q3 {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
}
