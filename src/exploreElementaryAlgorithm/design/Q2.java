package exploreElementaryAlgorithm.design;

import java.util.Stack;

/**
 * @author singlee
 * @create 2020-07-20-21:42
 * 最小栈
 */
public class Q2 {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    //采用辅助栈的方式
    public Q2() {
        dataStack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int x) {
        dataStack.push(x);
        if(minStack.isEmpty()||x<=minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop() {
        int rst=dataStack.peek();
        if(rst==minStack.peek()){
            minStack.pop();
        }
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


}
