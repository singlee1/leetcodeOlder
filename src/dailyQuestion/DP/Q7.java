package dailyQuestion.DP;

import org.junit.Test;

/**
 * @author singlee
 * @create 2021-03-18-17:01
 * 钢条切割
 */
public class Q7 {


    public static int cut(int []p,int n) {
        if(n==0)
            return 0;
        int q=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++)
        {
            q=Math.max(q, p[i-1]+cut(p, n-i));
        }
        return q;
    }


    @Test
    public void Test(){
        int[] p = {1,5,8,9,10,17,17,20,24,30};
        System.out.println(cut(p, 3));

    }
}
