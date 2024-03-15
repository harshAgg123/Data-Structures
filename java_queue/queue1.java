package java_queue;
// class enqueue {
//     int front=-1;
//     int rear=-1;
//     int size;
//     int [] queue= new int[5];
        
//     public void enqueue1(int n){
//         if(front==-1 && rear==-1){
//             queue[++rear]=n;
//             front++;
//          }
//          else{
//             queue[++rear]=n;
//          }
//     }
//     public void show(){
//         for(int i=front;i<=rear;i++){
//             System.out.println(queue[i]);
//         }
//     }
// }

public class queue1 {
    public static void main(String[] args) {
        queue_arr q1=new queue_arr();
        q1.enqueue1(10);
        q1.enqueue1(20);
        q1.enqueue1(30);
        q1.enqueue1(40);
        q1.enqueue1(50);
        q1.dequeue1();
        q1.show1();
        q1.reverse();
        System.out.println();
        System.out.println();
        q1.show1();
        
    }
    
}
