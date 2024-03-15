package linked_list;

public class llelement {
    public static void main(String[] args) {
        linkedlist ll1= new linkedlist();
        Node node1=ll1.head;
        ll1.insert(10);
        ll1.insert(20);
        ll1.insert(30);
        ll1.insert(40);
        ll1.insert(50);
        ll1.insert(60);
        ll1.insert(70);
        ll1.delete_front();
        ll1.delete_last();
        ll1.delete_given(2);
        System.out.println(ll1.size());
        ll1.display(node1);     
        System.out.println();
        Node node2=ll1.reverse(node1);
        ll1.display(node2);

}
}
