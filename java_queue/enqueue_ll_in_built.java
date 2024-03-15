package java_queue;

import java.util.*;

public class enqueue_ll_in_built {
    LinkedList <Integer> l23= new LinkedList<Integer>();
    int front=-1;
    int rear=-1;
    public void enqueue2(int n){
        if(front==-1 && rear==-1){
            l23.add(n);
            front++;
            rear++;
        }
        else{
            l23.add(n);
            rear++;
        }   
    }
    public void dequeue2(){
        System.out.println(l23.get(front));
        l23.removeFirst();
       // front++;
    }
    public void show2(){
        System.out.println(l23);

        // for(int i=front;i<=rear;i++){
        //     System.out.print(l23.get(i));
        

    }    
}
