import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        char info[] = {'A','B','C','D','E','F','G',' ','H',' ',' ','I','J',' ',' '};
        int left[] = {1,3,5,-1,-1,11,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int right[] = {2,4,6,8,-1,12,-1,-1,-1,-1,-1,-1,-1,-1,-1};

        Inorder i_traversal = new Inorder(info,left,right);
        Preorder p_traversal = new Preorder(info,left,right);
        PostOrder po_traversal = new PostOrder(info,left,right);

        System.out.println("InOrder Traversal");
        i_traversal.inorderTraversal();
        System.out.println("\nPreOrder Traversal");
        p_traversal.preTraversal();
        System.out.println("\nPostOrder Traversal");
        po_traversal.postTraversal();
    }
}
