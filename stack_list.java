import java.util.*;


class Stack{
  
    ArrayList<Integer> st = new ArrayList<Integer>();
    int top=-1;
      public void push(int item){
        st.add(item);
        top+=1;
    }
    public int pop(){
        if(top==0)
        return 0;
        int item =st.remove(top);
        // top--;
        top--;
        return item;
    }
    public void display(){
        //Collections.reverse(st);
        for(int i=top;i>=0;i-- ){
            System.out.println(st.get(i));
        }
        //System.out.println(st);
    }}
public class stack_list{
    public static void main(String[] args){
        Stack s1= new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);
        System.out.println(s1.pop());
        s1.display();
    }
}