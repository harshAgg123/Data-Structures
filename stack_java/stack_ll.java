package stack_java;
import linked_list.*;

public class stack_ll {
    public static void main(String[] args){
        linkedlist st1= new linkedlist();
       // Node node1=st1.head;
        st1.insert(10);
        st1.insert(20);
        st1.insert(30);
        st1.insert(40);
        st1.insert(50);
        st1.insert(60);
       // st1.reverse(); 
        st1.delete_last();
        Node node2=st1.reverse(st1.head);
        st1.display(node2);
    }
}
