package java_queue;


import linked_list.*;
public class queue_ll {
    int front=-1;
    int rear=-1;
    linkedlist queue=new linkedlist();
    Node head3=queue.head();
    
public void enqueue3(int a){
    if(front==-1 && rear==-1){
        queue.insert(a);
        front++;
        rear++;
    }
    else{
        queue.insert(a);
        rear++;
    }}
    public void dequeue3(){
        if(front==-1){
            System.out.println("empty");
    }
        else{
            queue.delete_front();
            front++;
        }
    }
    public void show3(){
        queue.display(head3);
    }
    // public void reverse3(){
    //     Node node3=queue.reverse(head3);   
    //     queue.display(node3);
    // }
}
