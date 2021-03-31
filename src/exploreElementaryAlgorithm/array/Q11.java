package exploreElementaryAlgorithm.array;

/**
 * @author singlee
 * @create 2020-04-17-21:06
 * 旋转图像
 */
public class Q11 {

    public void rotate(int[][] matrix) {
        int len=matrix.length;
        //先转置一下矩阵
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //再把每行倒一下
        for (int i=0;i<len;i++){
            for(int j=0;j<len/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][len-j-1];
                matrix[i][len-j-1]=temp;
            }
        }

    }
}
