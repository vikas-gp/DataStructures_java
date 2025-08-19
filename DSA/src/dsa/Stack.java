/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author vikas g
 */
public class Stack {
    int[] arr;
    int top;
    int size;
    
    Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }
    
    void push(int i){
        if(top==size-1)
            System.out.println("Stack Overflow");
        else
            arr[++top]=i;
    }
    
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        else{
            top--;
        }
    }
    
    void Top(){
        if(top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println(arr[top]);
        }
    }
    
    void printStack(){
        if(top==-1){
            System.out.println("Stack Underflow");
        }else{
            int count=top;
            while(count!=0){
                System.out.println(arr[count--]);
            }
    }
}
}


class Driver{
    public static void main(String[] args) {
        Stack st= new Stack(5);
        st.push(1);
        st.push(5);
        st.push(2);
        st.push(3);
        st.push(4);
        st.Top();
        st.pop();
        st.pop();
        st.printStack();
    }
}
