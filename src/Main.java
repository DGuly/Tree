/**
 * Created by Dmytry on 9/28/2014.
 */
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(5, 1);

        tree.add(15, 5);
        tree.add(4, 5);
        tree.add(500, 5);

        tree.add(2, 4);
        tree.add(1, 4);
        tree.add(3, 4);

        tree.add(-1, 500);

        System.out.println(tree.findMin().getValue());
    }
}
