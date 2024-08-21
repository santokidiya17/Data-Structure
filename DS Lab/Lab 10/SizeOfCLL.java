public class SizeOfCLL {

    class Node {
        int data;
        Node link;
    }

    Node first = null;
    Node last= null;

    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
        } else {
            newNode.link = first;
            last.link = newNode;
            first = newNode;
        }
    }

    public int sizeOFList() {
        int size = 0;
        Node save = first;
        if (save == null) {
            return size;
        }
        do {
            save = save.link;
            size++;
        } while (save != first);
        return size;
    }

    public static void main(String[] args) {
        SizeOfCLL cll = new SizeOfCLL();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        System.out.println(cll.sizeOFList());;
    }
}
