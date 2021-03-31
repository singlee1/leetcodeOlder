package summaryOfInterviewQuestions.beforeTheStart;

import java.util.HashMap;
import java.util.Map;

/**
 * @author singlee
 * @create 2020-09-17-22:49
 * 多数元素
 */
public class Q2 {



    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else {
                map.put(num,map.get(num)+1);
            }

        }
        Map.Entry<Integer,Integer> majorEntry=null;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(majorEntry==null||entry.getValue()>majorEntry.getValue()){
                majorEntry=entry;
            }
        }

        return majorEntry.getKey();
    }
}
