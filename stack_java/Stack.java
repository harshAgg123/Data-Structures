package stack_java;
import java.util.*;
public class Stack{
    int top;
    ArrayList<Character> st1 = new ArrayList<Character>();
      public void push(char string){
        st1.add(string);
        top=st1.size();
    }
    public Character pop(){
        Character item =st1.remove(top-1);
        return item;
    }
    public void display(){
        Collections.reverse(st1);
        System.out.println(st1);
    }}
