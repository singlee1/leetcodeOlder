package dailyQuestion.DP;

import org.junit.Test;

/**
 * @author singlee
 * @create 2021-03-22-10:50
 * 礼物的最大价值
 */
public class Q11 {

    public int maxValue(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        //也可以直接在gird上修改
        int[][] rst=new int[row][col];
        //initialize
        rst[0][0]=grid[0][0];
        for(int i=1;i<row;i++){
            rst[i][0]=rst[i-1][0]+grid[i][0];
        }
        for(int i=1;i<col;i++){
            rst[0][i]=rst[0][i-1]+grid[0][i];
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                rst[i][j]=Math.max(rst[i-1][j],rst[i][j-1])+grid[i][j];

            }
        }

        return rst[row-1][col-1];
    }

    //直接在原数组上修改
    public int maxValue1(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 && j==0){
                    continue;
                }else if(i==0){
                    grid[i][j]+=grid[i][j-1];
                }else if(j==0){
                    grid[i][j]+=grid[i-1][j];
                }else {
                    grid[i][j]+=Math.max(grid[i][j-1],grid[i-1][j]);
                }
            }
        }
    return grid[row-1][col-1];
    }

    @Test
    public void test(){
        int[][] gift=new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        int rst=maxValue(gift);
        System.out.println(rst);
    }
}
