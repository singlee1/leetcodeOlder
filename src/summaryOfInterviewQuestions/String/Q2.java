package summaryOfInterviewQuestions.String;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author singlee
 * @create 2021-01-06-16:06
 * 分割回文串
 */
public class Q2 {

    public List<List<String>> partition(String s) {

        int length=s.length();
        List<List<String>> rst=new LinkedList<>();
        //如果字符串为空，返回一个空List
        if(length==0){
            return rst;
        }

        Deque<String> stack=new ArrayDeque<>();
        //交给这个方法处理
        backtracking(s, 0, length, stack, rst);

        return rst;

    }

    public void backtracking(String s, int start, int length, Deque<String> path, List<List<String>> rst){
        if(start==length){
            rst.add(new LinkedList<>(path));
            return;
        }
        for(int i=start;i<length;i++){
            //如果不是回文串的话，剪枝
            if(!checkPalindrome(s,start,i)){
                continue;
            }
            path.addLast(s.substring(start,i+1));
            backtracking(s, i+1, length, path, rst);
            path.removeLast();
        }

    }

    public boolean checkPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    @Test
    public void test(){
        String s="aabb";
        List<List<String>> rst=partition(s);
        System.out.println(rst);
    }
}
