package dailyQuestion.DP;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author singlee
 * @create 2021-03-13-22:48
 * 零钱兑换
 */
public class Q2 {
    //DP数组法
    public int coinChange(int[] coins, int amount) {
        //创建一个DP数组,初值全赋为无穷大
        int max=amount+1;
        int[] dp=new int[max];

        //base case
        dp[0]=0;
        //填充
        for(int i=1;i<=amount;i++){
            dp[i]=max;
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    //比较赋值
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
                //以上循环的代码和下面的代码功能功能相同，下面的便于理解
/*              当只有2,5,7三种规格的硬币时
                    if (X>=2){
                        res = Math. min((X -2) + 1, res);
                    }
                    if (X>=5){
                        res = Math. min(X-5) + 1, res);
                    }
                    if (X>=7){
                        res = Math. min(X-7) + 1, res);
                    return res;
*/

            }
        }
    return dp[amount]>amount?-1:dp[amount];
    }

    @Test
    public void test(){
        int[] coins={1,2,5};
        int account=11;
        System.out.println(coinChange(coins, account));

    }
}
