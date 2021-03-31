package exploreElementaryAlgorithm.others;

/**
 * @author singlee
 * @create 2020-08-09-11:07
 * 汉明距离
 */
public class Q2 {


    public int hammingDistance(int x, int y) {
        int xor=x^y;        //^为异或操作
        int count=0;
        while (xor!=0){
            if((xor%2)==1){
                count++;
            }
            xor=xor>>1;     //移位

        }

        return count;
    }


}
