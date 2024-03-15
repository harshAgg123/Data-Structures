class stack1 {
   int top=-1;
   int size=5;
   int [] stack= new int[size];
    public boolean isfull(){
        if(top==size-1){
            return true;
        }
        else{
        return false;
     }}
     public boolean isempty(){
        if(top==-1){
            return true;
        }
        else{
        return false;
     }}
     
    public void push(int item){
        if(isfull()){
            return;
        }
        stack[++top]=item;
    }
    public void pop(){
        if(isempty()){
            return;
        }
            top--;
    }
    public void display(){
        if(isempty()){
            return;
        }
        int i;
        System.out.print("{");
        for(i=top;i>-1;i--){
            System.out.print(stack[i]+",");
        }
        System.out.println("}");
    }    
}
public class stack_array{
    public static void main(String[] args){
        stack1 s2= new stack1();
        s2.push(10);
        s2.push(20);
        s2.push(30);
        s2.push(40);
        s2.push(50);
        s2.pop();
        s2.display();

    }}