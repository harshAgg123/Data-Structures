package stack_java;



public class string_reverse{
    public static void main(String[] args){
        Stack s2= new Stack();
        s2.push('H');
        s2.push('I');
        s2.push('H');
        s2.push('E');
        s2.push('l');
        s2.push('l');
        s2.push('o');
        System.out.println(s2.pop());
        s2.display();
    }
}