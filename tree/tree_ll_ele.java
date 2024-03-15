package tree;
public class tree_ll_ele {
    public static void main(String[] args){
        //tree__ll binary_T= new tree__ll();
        node root2=tree__ll.create();
        //System.out.println(root2.data);
        System.out.print("preorder traversal is:"+" ");
        tree__ll.preorder(root2);
        System.out.println();
        System.out.print("inorder traversal is:"+" ");
        tree__ll.inorder(root2);
        System.out.println();
        System.out.print("postorder traversal is:"+" ");
        tree__ll.postorder(root2);
        System.out.println();
        System.out.println(tree__ll.height(root2));
        System.out.println(tree__ll.size(root2));
        System.out.println(tree__ll.maximum(root2));
        System.out.println(tree__ll.minimum(root2));
        System.out.println("level order with method 1");
        tree__ll.print_levelorder(root2);
        System.out.println("level order with method 2");
        tree__ll.levelorder1(root2);
        System.out.println("left view of tree");
        System.out.println(tree__ll.leftView(root2));
        System.out.println("right view of tree");
        System.out.println(tree__ll.rightsideview(root2));
        System.out.println(tree__ll.diameter(root2));

    }
}


