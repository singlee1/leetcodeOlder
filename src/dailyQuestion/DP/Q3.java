package dailyQuestion.DP;

/**
 * @author singlee
 * @create 2021-03-15-22:43
 * 斐波那契数列
 */
public class Q3 {
    public int fib(int n) {
        if(n<1) return 0;
        if(n==1 || n==2) return 1;
        int pre=1,cur=1;
        for(int i=3;i<=n;i++){
            int nxt=(pre + cur)% 1000000007;

            pre=cur;
            cur=nxt;
        }
    return cur;
    }
}
