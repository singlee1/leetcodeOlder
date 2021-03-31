package dailyQuestion.DP;

/**
 * @author singlee
 * @create 2021-03-28-21:46
 * 股票的最大利润
 */
public class Q12 {

    public int maxProfit(int[] prices) {
        //当前最低
        int cost=Integer.MAX_VALUE,profit=0;
        for(int price:prices){
            cost=Math.min(cost,price);
            profit=Math.max(profit,price-cost);
        }
        return profit;
    }
}
