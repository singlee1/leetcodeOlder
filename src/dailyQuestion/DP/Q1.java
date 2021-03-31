package dailyQuestion.DP;

/**
 * @author singlee
 * @create 2021-03-13-22:36
 * 斐波那契数
 */
public class Q1 {
    //采用dp数组的方法
    public int fib(int n) {
        if(n<1) return 0;
        if(n==1 || n==2){
            return 1;
        }
        int pre=1,cur=1;
        for(int i=3;i<=n;i++){
            int sum=pre+cur;
            pre=cur;
            cur=sum;
        }
        return cur;
    }
}
