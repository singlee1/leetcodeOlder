package exploreElementaryAlgorithm.dynamicProgramming;

/**
 * @author singlee
 * @create 2020-05-27-23:46
 * 买卖股票的最佳时机
 */
public class Q2 {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];

            }else if(prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
    return maxProfit;
    }


}
