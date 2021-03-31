package exploreElementaryAlgorithm.array;

/**
 * @author singlee
 * @create 2020-04-16-20:24
 * 加一
 */
public class Q7 {


    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            digits[i]%=10;
            if(digits[i]%10!=0){
                return digits;
            }
        }
        int[] digits1=new int[digits.length+1];
        digits1[0]=1;

        return digits1;
    }
}
