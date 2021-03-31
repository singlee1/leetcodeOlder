package dailyQuestion.DP;

/**
 * @author singlee
 * @create 2021-03-21-21:49
 * 把数字翻译成字符串
 */
public class Q10 {

    public int translateNum(int num) {
        String s=String.valueOf(num);
        //pre指向i-2的位置，cur指向i-1，初始值分别为f(0)和f(1)
        int pre=1;
        int cur=1;
        int rst=0;
        for(int i=2;i<=s.length();i++){
            String tmp=s.substring(i-2,i);
            if(tmp.compareTo("10")>=0 && tmp.compareTo("25")<=0){
                rst=pre+cur;
            }
            else {
                rst=cur;
            }
            pre=cur;
            cur=rst;
        }
        return cur;
    }
}
