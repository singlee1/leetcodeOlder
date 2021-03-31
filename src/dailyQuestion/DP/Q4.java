package dailyQuestion.DP;

/**
 * @author singlee
 * @create 2021-03-16-21:39
 * 青蛙跳台阶问题
 */


/*
*   斐波那契数列问题，用四种方式实现
*   1.普通递归
*   2.加备忘录的递归
*   3.动归
*   4.动归优化版
* */
public class Q4 {
    //法1
    public int numWays1(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return numWays1(n-1)+numWays1(n-2);
    }

    //法2
    public int numWays2(int n) {
        int[] m=new int[n+1];
        return numWays2(n,m);
    }
    public int numWays2(int n,int[] m) {
        if(m[n]>0){
            return m[n];
        }

        if(n==1){
            m[n]=1;
        }else if(n==2){
            m[n]=2;
        }else {
            m[n]=numWays2(n-1,m)+numWays2(n-2,m);
        }
        return m[n];
    }

    //法3
    public int numWays3(int n) {
        if(n==1){
            return 1;
        }
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    //法4
    public int climbStairs(int n) {
        if(n<=1) return 1;
        if(n==2) return 2;

            int first=1;
            int second=2;

            for(int i=3;i<=n;i++){
                int rst=first+second;
                first=second;
                second=rst;

            }
            return second;
    }

}
