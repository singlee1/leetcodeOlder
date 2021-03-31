package dailyQuestion.DP;

import javax.annotation.Resource;

/**
 * @author singlee
 * @create 2021-03-20-20:20
 * 不同路径
 */
public class Q8 {

    public int uniquePaths(int m, int n) {
        int[][] rst=new int[m][n];
        //base case
        rst[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    rst[i][j]=1;
                }
                else{
                    rst[i][j]=rst[i-1][j]+rst[i][j-1];
                }

            }
        }
        return rst[m-1][n-1];
    }

}
