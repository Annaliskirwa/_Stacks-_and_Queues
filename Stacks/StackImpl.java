package Stacks;

import java.util.ArrayList;
import java.util.List;

class MyStack{
    //Storing the stack elements
    private List<Integer> data;
    public MyStack(){
        data = new ArrayList<>();
    }
    public void push(int x){
        //inserting an element into the stack
        data.add(x);
    }
    public boolean isEmpty(){
        //checks if the stack is empy or not
        return data.isEmpty();
    }
    public int top(){
        //getting the data at the top of the stack
        return data.get(data.size()-1);
    }
    public boolean pop(){
        if (isEmpty()){
            return false;
        }
        //removing data at the top
        data.remove(data.size()-1);
        return true;
    }
}
public class StackImpl{
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        for (int i = 0; i < 5; i++){
            if (!s.isEmpty()){
                System.out.println(s.top());
            }
            System.out.println(s.pop());
        }
    }
}