package summaryOfInterviewQuestions.beforeTheStart;

import org.junit.Test;

/**
 * @author singlee
 * @create 2020-09-22-23:19
 * 搜索二维矩阵 II
 */
public class Q3 {
    public static void main(String[] args) {

    }


    public boolean searchMatrix(int[][] matrix, int target) {
       int i=matrix.length-1;
       int j=0;
       while(i>=0&&j<matrix[0].length){
           if(target>matrix[i][j]){
               j++;
           }else if(target<matrix[i][j]){
               i--;
           }else {
               return true;
           }

       }
       return false;
    }


    @Test
    public void test1(){
        int[][] arr={{1,   4,  7, 11, 15},
  {2,   5,  8, 12, 19},
        {3,   6,  9, 16, 22},
            {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
    };


     boolean b=searchMatrix(arr,5);
        System.out.println(b);
    }


}
