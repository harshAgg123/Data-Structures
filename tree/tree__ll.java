package tree;
import java.util.*;
import java.util.spi.ResourceBundleControlProvider;
public class tree__ll {
    static node create(){
    Scanner sc = new Scanner(System.in);
    node root = null;
    System.out.println("Enter value");
    int a = sc.nextInt();
    if(a==-1)
        return null;
    root = new node(a);
    System.out.println("enter left node" + root.data);
    root.left=create();
    System.out.println("enter right node" + root.data);
    root.right=create();
    return root;
    }

    static void preorder(node root1){
        if (root1==null) {
            return;
        }
        System.out.print(root1.data +" ");
        preorder(root1.left);
        preorder(root1.right);
    
    }
    static void postorder(node root1){
        if (root1==null) {
            return;
        }
        postorder(root1.right);
        postorder(root1.left);
        System.out.print(root1.data +" ");

    }
    static void inorder(node root1){
        if (root1==null) {
            return;
        }
            inorder(root1.left);
            System.out.print(root1.data +" ");
            inorder(root1.right);
           
        }
         
        static int height(node root1){
            if(root1==null){
                return 0;
            }
           return Math.max(height(root1.left),height(root1.right))+1; 
        }
        static int size(node root1){
            if(root1==null){
                return 0;
            }
            return size(root1.left)+  size(root1.right)+1;
        }

static int maximum(node root1){
    if(root1==null){
        return Integer.MIN_VALUE;
    }
return Math.max(root1.data, Math.max(maximum(root1.left), maximum(root1.right)));
 }
 static int minimum(node root1){
    if(root1==null){
        return Integer.MAX_VALUE;
    }
return Math.min(root1.data, Math.min(minimum(root1.left), minimum(root1.right)));
    }
    static void print_levelorder(node root1){
        int h=height(root1);
        for(int i=1;i<=h;i++){
           levelorder(root1,i);
        }
    }
    static  void levelorder(node root1, int level){
        if(root1==null){
            return;
        }
        if(level==1){
            System.out.println(root1.data);
        }
        else if(level>1){
            levelorder(root1.left,level-1);
            levelorder(root1.right,level-1);
        }
    }
    static void levelorder1(node root1){
        Queue<node> q=new LinkedList<>();
        q.add(root1);
        while(!q.isEmpty()){
            node crr=q.poll();
            System.out.println(crr.data);
            if(crr.left!=null){
                q.add(crr.left);
            }
            if(crr.right!=null){
                q.add(crr.right);
            }
        }
    }
    static List<Integer> rightsideview(node root1){
        List<Integer> result=new ArrayList<>(0);
        rightview(root1,result,0);
        return result;
    }
    static void rightview(node crr, List<Integer> result,int currDepth){
        if(crr==null){
            return;
        }
        if(currDepth==result.size()){
            result.add(crr.data);
        }
        rightview(crr.right,result,currDepth+1);
        rightview(crr.left,result,currDepth+1);
    }
    public static ArrayList<Integer> leftView(node root1)
    {
        ArrayList<Integer> ans = new ArrayList<>();
 
        if (root1 == null) {
            return ans;
        }
 
        Queue<node> q = new LinkedList<>();
        q.add(root1);
        q.add(null);
        boolean ok = true;
 
        while (!q.isEmpty()) {
            node it = q.poll();
            if (it == null) {
                if (ok == false) {
                    ok = true;
                }
 
                if (q.size() == 0)
                    break;
 
                else {
                    q.add(null);
                }
            }
            else {
 
                if (ok) {
                    ans.add(it.data);
                    ok = false;
                }
 
                if (it.left != null) {
                    q.add(it.left);
                }
 
                if (it.right != null) {
                    q.add(it.right);
                }
            }
        }
 
        return ans;
    }
    static int diameter(node root1){
        if(root1==null){
            return 0;
        }
        int dl=diameter(root1.left);
        int dr=diameter(root1.right);
        int crr=1+height(root1.left)+height(root1.right);
        return Math.max(crr, Math.max(dl,dr));
    }
}
