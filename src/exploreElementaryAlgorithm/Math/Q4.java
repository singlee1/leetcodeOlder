package exploreElementaryAlgorithm.Math;

/**
 * @author singlee
 * @create 2020-08-06-22:47
 * 罗马数字转整数
 */
public class Q4 {
    public int romanToInt(String s) {
        int preNum=getValue(s.charAt(0));
        int sum=0;
        for(int i=1;i<s.length();i++){
            int num=getValue(s.charAt(i));
            if(preNum<num){
                sum-=preNum;
            }else {
                sum+=preNum;
            }
            preNum=num;
        }
        sum+=preNum;
        return sum;

    }
    public int getValue(char c){
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
