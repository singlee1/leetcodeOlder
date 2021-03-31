package dailyQuestion.DP;

/**
 * @author singlee
 * @create 2021-03-20-21:14
 * 跳跃游戏
 */
public class Q9 {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean[] rst=new boolean[n];
        //base case
        rst[0]=true;

        for(int i=1;i<n;i++){
            rst[i]=false;
            for(int j=0;j<i;j++){
                //判断能否到达i
                if(rst[j] && j+nums[j]>=i){
                    rst[i]=true;
                    break;
                }
            }
        }
        return rst[n-1];
    }
}
