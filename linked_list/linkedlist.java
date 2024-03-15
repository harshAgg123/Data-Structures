package linked_list;
public class linkedlist {
    public Node head=null;
    Node tail=null;
  
    public void insert(int a){
        Node newNode=new Node(a);
        //Node temp=new Node();
       // temp=head;
        newNode.data=a;
        newNode.next=null;
        if(head==null){
            head= newNode;
            tail=newNode;
        }
        else{
            tail.next=(Node) newNode;
            tail=newNode;
        }
    }
    public void display(Node node){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void delete_front(){
        head=head.next;
    }
    public void delete_last(){
        Node temp= head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        
        temp.next=null;
        tail=temp;
    }
    public int size(){
        int n=0;
        Node temp= head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        return n;
    }
    public void delete_given(int pos){
        int i=0;
        Node temp= head;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
       temp.next=temp.next.next;   
    }
    public Node reverse(Node node){
        Node current=node;
        Node prev=null;
        Node Next=null;
        while(current!=null){
            Next=current.next;
            current.next=prev;
            prev=current;
            current=Next;}
            Node head1=prev;
            return head1;
        }
    public Node head() {
        return head;
    }
    }

      

