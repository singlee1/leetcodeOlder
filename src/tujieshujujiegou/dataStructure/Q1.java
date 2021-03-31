package tujieshujujiegou.dataStructure;

import org.junit.Test;

/**
 * @author singlee
 * @create 2020-11-15-21:50
 * 替换空格
 */
public class Q1 {
    public String replaceSpace(String s) {
        String s1=s.replace(" ","%20");
        return s1;
    }

    public String replaceSpace1(String s) {
        char[] chars=s.toCharArray();
        StringBuilder s1 = new StringBuilder();
        for(char c1:chars){
            if(c1==' '){
                s1.append("%20");
            }else {
               s1.append(c1);

            }
        }
        return s1.toString();
    }

    public String replaceSpace2(String s) {
        int count=0,len=s.length();
        char[] oldString=s.toCharArray();
        for(char c:s.toCharArray()){
            if(c==' '){
                count++;
            }
        }
        char[] s1=new char[2*count+len];
        System.arraycopy(oldString,0,s1,0,len);
        int i=len-1;
        int j=2*count+len-1;
        while(i<j){
            if(s1[i]!=' '){
                s1[j]=s1[i];
                i--;
                j--;
            }else {
                s1[j-2]='%';
                s1[j-1]='2';
                s1[j]='0';
                j-=2;
                i--;
                j--;
            }
        }
        return String.valueOf(s1);
    }

    @Test
    public void test(){
        String s=replaceSpace2("We are");
        System.out.println(s);
    }
}
