// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.


package Stacks;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    List<Integer>stack;

    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
       int min = stack.get(0);
        for (int i = 0; i < stack.size(); i++){
            if (stack.get(i) < min) min = stack.get(i);
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */