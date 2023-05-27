import java.util.Stack;

public class Inorder {
    private Stack<Integer> tree = new Stack<>();
    private char info[] = {};
    private int left[] = {};
    private int right[] = {};

    public Inorder(char info[],int left[],int right[]){
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public void inorderTraversal(){
        int root = 0;
        tree.push(root);
        while(!tree.isEmpty()){
            while (root != -1) {
                tree.push(root);
                root = left[root];
            }

            if(!tree.isEmpty()){
                int popped = tree.pop();
                System.out.print(info[popped]);
                root = right[popped];
            }
        }
    }

}
