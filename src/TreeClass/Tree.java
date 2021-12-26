package TreeClass;

import java.util.Stack;

/**
 *
 * @author Bima dan Zidan
 */
public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    public Node find(int key) {
        Node current = root;
        while (current.id != key) {
            if (key < current.id) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }
    

    public void insert(int id, String data) {
        Node newNode = new Node();
        newNode.id = id;
        newNode.data = data;
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                if (id == current.id) {
                    System.out.println("There is duplicated key " + id);
                    return;
                }
                parent = current;
                if (id < current.id) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }


    public String displayTree() {
        String[] tAnggota = new String[6];
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        int t = 0;
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < nBlanks; j++) {
            }

            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    tAnggota[t] = temp.data;
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if (temp.leftChild != null
                            || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(' ');
                }
                t++;
            }
            nBlanks /= 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }

        }

        String tree = ("\t\t\t\t   " + tAnggota[0] + "\n\t\t" + tAnggota[1] + "\t\t\t" + tAnggota[2]
                + "\n\t" + tAnggota[3] + "\t" + tAnggota[4] + "\t" + tAnggota[5]);

        return tree;
    }

}
