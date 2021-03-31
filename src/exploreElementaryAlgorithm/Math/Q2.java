package exploreElementaryAlgorithm.Math;

/**
 * @author singlee
 * @create 2020-08-03-22:04
 * 计数质数
 *
 */

import javafx.beans.binding.BooleanExpression;

import java.util.Map;

/**
 *  厄拉多塞筛法
 *      1.不计算偶数
 *      2.从3开始，其奇数倍也不是质数
 *      3.遍历到sqrt(n)即可
 *
 */

public class Q2 {
    public int countPrimes(int n) {
        int count=0;
        boolean[] b = new boolean[n]; //将合数置为true
        if (n < 2) {
            return count;
        }
        if(n>2){
            count++;
        }

        for(int i=3;i<= Math.sqrt(n);i+=2){
            if(!b[i]){
                for(int j=i;i*j<n;j+=2){
                    b[i*j]=true;
                }
            }
        }

        for(int i=3;i<b.length;i+=2){
            if(b[i]==false){
                count++;
            }
        }
    return count;
    }
}