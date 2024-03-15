package java_queue;

public class queue_ll_ele {
    public static void main(String[] args) {
        queue_ll queue4=new queue_ll();
        queue4.enqueue3(10);
        queue4.enqueue3(20);
        queue4.enqueue3(30);
        queue4.enqueue3(40);
        queue4.enqueue3(50);
        queue4.enqueue3(60);
        queue4.enqueue3(70);
        System.out.println(queue4.front);
        System.out.println(queue4.rear);
        queue4.show3();
        System.out.println();
        System.out.println();
        //queue4.reverse3();

        
    }
    
}
