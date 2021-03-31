package exploreElementaryAlgorithm.design;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author singlee
 * @create 2020-07-19-21:04
 * 打乱数组
 */
public class Q1 {
    private int[] array;
    private int[] original;

    private Random random=new Random();

    private List<Integer> getArrayCopy(){
        List<Integer> list=new ArrayList<>();
        for(int num:array){
            list.add(num);
        }
        return list;
    }

    //构造函数
    public Q1(int[] nums) {
        array=nums;
        original=array.clone();
    }



    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array=original;
        original=original.clone();
        return array;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> list=getArrayCopy();
        for(int i=0;i<array.length;i++){
            int removeIdx=random.nextInt(list.size());
            array[i]=list.get(removeIdx);
            list.remove(removeIdx);
        }
        return array;
    }


}
