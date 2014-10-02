import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmytry on 9/28/2014.
 */
public class Tree {

    Node root;

     class Node {
        int value;
        List<Node> children = new ArrayList<Node>();

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", children=" + children +
                    '}';
        }
        public int getValue() {
            return value;
        }
    }

    public Node search(int value) {
        return search(value, root);
    }

    public Node search(int value, Node node) {
        Node result = null;
        if (node == null) return node;
        //System.out.println(node.value + " - " + value);
        if (node.value == value) {
            //System.out.println("success");
            result = node;
            return result;
        }
        else {
            for (Node n : node.children) {
                //System.out.println(n.value + " ");
                if (result != null) {
                    if (result.value == value) return result;
                }
                else {
                    result = search(value, n);
                }

            }
        }
        return result;
    }

    public void add(int value, int place) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node parent = search(place);
            System.out.println("parent value is: " + parent.value);
            Node node = new Node(value);

            parent.children.add(node);
            System.out.println("node is added! Parent children are: " + parent.children);
        }
    }

    public Node findMin() {
        Node result;
        if (root.children.size() == 0) return root;
        else {
            result = findMin(root);
        }
        return result;
    }


    public Node findMin(Node node) {
        Node result = node;
        if (node.children.size() == 0) return node;
        for (Node n : node.children) {
            result = min(result, findMin(n));
        }
        return result;
    }

    public Node min(Node a, Node b) {
        System.out.println("snova pomenyal");
        System.out.println("Some string for conflict");
        if (a.value < b.value) return a;
        if (a.value > b.value) return b;
        return a;
    }

}
