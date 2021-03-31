package tujieshujujiegou.dataStructure;

import java.util.LinkedList;

/**
 * @author singlee
 * @create 2020-11-24-22:27
 * 用两个栈实现队列
 */
public class Q3 {
    LinkedList<Integer> A,B;

    public Q3() {
        A=new LinkedList<>();
        B=new LinkedList<>();
    }

    public void appendTail(int value) {
        A.addLast(value);
    }

    public int deleteHead() {
        if(!B.isEmpty()){
            return B.removeLast();
        }
        if(A.isEmpty()){
            return -1;
        }
        while(!A.isEmpty()){
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }
}
