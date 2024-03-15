package doubly_linked_list;

public class doublell {
    public static void main(String[] args) {
        doulinkedlist dll1= new doulinkedlist();
        dll1.insert(10);
        dll1.insert(20);
        dll1.insert(30);
        dll1.insert(40);
        dll1.insert(50);
        dll1.insert(60);
        dll1.insert(70);
        dll1.display();
        dll1.delete_end();
        dll1.delete_front();
       
        System.out.println();
        dll1.displayreverse();
        System.out.println();
        dll1.delete_given_from_front(2);
        dll1.display();

        
    }
    
}
