import java.util.*;
public class Preorder {
    private Stack<Integer> tree = new Stack<>();
    private char info[] = {};
    private int left[] = {};
    private int right[] = {};

    public Preorder(char info[],int left[],int right[]){
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public void preTraversal(){
        int root = 0;
        tree.push(root);

        while (!tree.isEmpty()) {
            int popped = tree.pop();
            System.out.print(info[popped]);

            if (right[popped] != -1) {
                tree.push(right[popped]);
            }

            if (left[popped] != -1) {
                tree.push(left[popped]);
            }
        }


    }
}
