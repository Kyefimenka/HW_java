public class Tree {
    public static void main(String[] args) {
        Node root = new Node(1);

        Node n2 = new Node(2);
        Node n3 = new Node(3);

        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n11 = new Node(11);
        Node n20 = new Node(20);

        root.children = new Node[] {n2, n3};

        n2.children = new Node[] {n4};
        n3.children = new Node[] {n5, n6};
        n4.children = new Node[] {n7, n8, n9};
        n6.children = new Node[] {n11, n20};

        preOrder(root, "");
    }
    static void preOrder(Node node, String space) {
          System.out.println(space + node.value);
        if (node.children != null) {
            for (Node child : node.children) {
                preOrder(child, space + "  ");
            }
        }
    }
}
class Node {
    int value;
    public Node(int value) {
        this.value = value;
    }
       Node[] children;
}

