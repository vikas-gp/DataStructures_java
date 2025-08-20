package queues;
public class Queues {
    int front;
    int back;
    int[] arr;
    int sizeQ;
    
    Queues(int sizeQ){
        this.sizeQ=sizeQ;
        arr = new int[sizeQ];
        front =-1;
        back=-1;
    }
    
    void push(int val){
        if(back==sizeQ-1){
            System.out.println("Queue Overflow");
        }else{
        back++;
        arr[back]=val;
        System.out.println("Pushed:"+arr[back]);
        if(front==-1)
            front++;
        }
    }
    
    void pop(){
        if(front==-1 || front>back){
            System.out.println("Queue Underflow");
        }else{
        System.out.println("Popped:"+arr[front++]);
        }
    }
    
    int peek(){
        if(front==-1 || front>back){
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front];
    }
    
    boolean isEmpty(){
        return (front==-1 || front>back);
    }
}


class Driver{
    public static void main(String[] args) {
        Queues q = new Queues(10);
        q.push(5);
        q.push(10);
        q.push(15);
        System.out.println("Is q empty:"+q.isEmpty());
        System.out.println("First element:"+q.peek());
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.peek();
    }
}