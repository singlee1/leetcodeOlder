package exploreElementaryAlgorithm.string;

/**
 * @author singlee
 * @create 2020-04-18-20:37
 * 整数反转
 */
public class Q2 {
    public int reverse(int x) {
        if(x==Integer.MIN_VALUE) return 0;
        int neg=x>0?1:-1;
        x*=neg;
        int ret=0;
        while (x>0){
            int n=ret;
            n*=10;
            n+=x%10;
            x/=10;
            if(n/10!=ret) return 0;
            ret=n;
        }


        return ret*neg;
    }
}
