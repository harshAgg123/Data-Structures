package doubly_linked_list;
public class doulinkedlist {
    Node head=null;
    Node tail=null;
     public void insert(int a){
        Node newnode= new Node();
        //Node temp=head;
        newnode.data=a;
        if(head==null){
            head=newnode;
            tail=newnode;
            head.pre=null;
            tail.pre=null;
              }
        else{
            tail.next=newnode;
            newnode.pre=tail;
            tail=newnode;
            tail.next=null;
        }

     }

     public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
     }
     public void displayreverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.pre;
        }
     }
     public void delete_front(){
        head=head.next;
        head.pre=null;
     }
     public void delete_end(){
        tail=tail.pre;
        tail.next=null;
     }
     public void delete_given_from_front(int pos){
        Node temp=head;
        int count=0;
        while(count<pos-1){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        temp.next.next.pre=temp;

     }
}
