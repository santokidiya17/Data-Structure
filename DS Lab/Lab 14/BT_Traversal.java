//import java.util.Scanner;

public class BT_Traversal {

    static class Node {
        char info;
        Node lptr;
        Node rptr;

        public Node(char data) {
            info = data;
            lptr = null;
            rptr = null;
        }
    }

    public Node t = null;

    public static Node buildTree(char[] nodes , int idx) {
        if(idx < nodes.length){
        Node newNode = new Node(nodes[idx]);
        newNode.lptr = buildTree(nodes , 2*idx+1);
        newNode.rptr = buildTree(nodes , 2*idx + 2);
        return newNode;
        }
        return null;
    }

    public static void RPREORDER(Node t) {
        if (t == null) {
            return;
        }
        System.out.print(t.info + " ");
        int left = (t.lptr == null)?0:t.lptr.info;
        int right = (t.rptr == null)?0:t.rptr.info;
        System.out.println("Left"+left);
        System.out.println("right"+right);
        RPREORDER(t.lptr);
        RPREORDER(t.rptr);

    }

    public static void RINORDER(Node t) {
        if (t == null) {
            return;
        }

        RINORDER(t.lptr);
        System.out.print(t.info + " ");
        RINORDER(t.rptr);

    }

    public static void RPOSTORDER(Node t) {
        if (t == null) {
            return;
        }

        RPOSTORDER(t.lptr);
        RPOSTORDER(t.rptr);
        System.out.print(t.info + " ");

    }

    public static void main(String[] args) {
       char[] nodes = {'a','b','c','d','e','f','g'};
        Node root = buildTree(nodes,0);
        RINORDER(root);
    }
}
