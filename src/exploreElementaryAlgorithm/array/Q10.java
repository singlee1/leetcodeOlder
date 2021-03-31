package exploreElementaryAlgorithm.array;

import java.util.HashMap;

/**
 * @author singlee
 * @create 2020-04-17-18:17
 * 有效的数独
 */
public class Q10 {

    public boolean isValidSudoku(char[][] board) {
        //先创建三个Map的数组
        HashMap<Integer,Integer>[] rows=new HashMap[9];
        HashMap<Integer,Integer>[] cols=new HashMap[9];
        HashMap<Integer,Integer>[] boxes=new HashMap[9];

        for(int i=0;i<9;i++){
            rows[i]=new HashMap<Integer,Integer>();
            cols[i]=new HashMap<Integer,Integer>();
            boxes[i]=new HashMap<Integer,Integer>();

        }
        //遍历
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c=board[i][j];
                int box_index=(i/3)*3+j/3;
                if(c!='.'){
                    int n=(int)c;
                    rows[i].put(n,rows[i].getOrDefault(n,0)+1);
                    cols[j].put(n,cols[j].getOrDefault(n,0)+1);
                    boxes[box_index].put(n,boxes[box_index].getOrDefault(n,0)+1);

                    if(rows[i].get(n)>1||cols[j].get(n)>1||boxes[box_index].get(n)>1){
                        return false;
                    }
                }
            }
        }


        return true;
    }
}
