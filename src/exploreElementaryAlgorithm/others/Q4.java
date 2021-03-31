package exploreElementaryAlgorithm.others;

import java.util.ArrayList;
import java.util.List;

/**
 * @author singlee
 * @create 2020-08-18-22:49
 * 杨辉三角
 */
public class Q4 {


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){     //每一行
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    list.add(1);
                }else {
                    list.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
                }

            }
            lists.add(list);
        }
    return lists;
    }
}
