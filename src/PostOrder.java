import java.util.Stack;

public class PostOrder {
    private Stack<Integer> tree = new Stack<>();
    private Stack<Integer> result = new Stack<>();
    private char info[] = {};
    private int left[] = {};
    private int right[] = {};

    public PostOrder(char info[],int left[],int right[]){
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public void postTraversal(){
        int root = 0;
        tree.push(root);

        while (!tree.isEmpty()) {
            int popped = tree.pop();
            result.push(popped);

            if (left[popped] != -1) {
                tree.push(left[popped]);
            }

            if (right[popped] != -1) {
                tree.push(right[popped]);
            }

        }

        while(!result.isEmpty()){
            int position = result.pop();
            System.out.print(info[position]);
        }

    }
}
