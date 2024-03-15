package java_queue;
public class queue_arr {
    int front = -1;
    int rear = -1;
    int size;
    int[] queue = new int[5];
    public void enqueue1(int n) {
        if (front == -1 && rear == -1) {
            queue[++rear] = n;
            front++;
        } else {
            queue[++rear] = n;
        }
    }
    public void dequeue1(){
        if(front==-1 && rear==-1){
            return;
        }
        else{
            front++;
        }
    }
    public void show1() {
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }
    public void reverse(){
        int j=rear;
        int i;
        int mid=(front+rear)/2;
        for(i=front;i<mid;i++){
            int temp=queue[j];
            queue[j]=queue[i];
            queue[i]=temp;
            j--;
        }
    }
}
