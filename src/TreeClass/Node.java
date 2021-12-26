package TreeClass;

/**
 *
 * @author Bima dan Zidan
 */
public class Node {

    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;

    public String displayNode() {
        String disp = (data + " Sebagai ");
        return disp;
    }
}
