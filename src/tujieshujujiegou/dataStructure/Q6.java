package tujieshujujiegou.dataStructure;

import java.util.Stack;

/**
 * @author singlee
 * @create 2021-02-04-21:55
 * 剑指 Offer 30. 包含 min 函数的栈
 */
public class Q6 {

}
class MinStack {
    private Stack<Integer> stack;
    //来存储每个时刻栈的最小值
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()){
           minStack.push(x);
        }else {
            if(x<minStack.peek()){
                minStack.push(x);
            }else {
                minStack.push(minStack.peek());
            }
        }
    }

    public void pop() {
        if(stack.isEmpty()){
            throw new RuntimeException("栈空了");
        }
        stack.pop();
        minStack.pop();
    }

    public int top() {
        if(stack.isEmpty()){
            throw new RuntimeException("栈空了");
        }
        return stack.peek();
    }

    public int min() {
        if(stack.isEmpty()){
            throw new RuntimeException("栈空了");
        }
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */


