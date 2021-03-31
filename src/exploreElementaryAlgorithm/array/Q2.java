package exploreElementaryAlgorithm.array;

/**
 * @author singlee
 * @create 2020-04-15-20:51
 *
 *      买卖股票的最佳时机 II
 */
public class Q2 {

    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int profits=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profits+=(prices[i]-prices[i-1]);
            }
        }

        return profits;
    }
}
