/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedList;
public class Node {
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class SLL{
    Node head;
    SLL(){
        head=null;
    }
    
   void InsertAtHead(int val){
       Node n = new Node(val);
       n.next=head;
       head=n;
   }  
}


class DriverCode{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.InsertAtHead(50);
        sll.InsertAtHead(10);
        sll.InsertAtHead(20);
        sll.InsertAtHead(30);
    }
}