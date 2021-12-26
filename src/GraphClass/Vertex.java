package GraphClass;

public class Vertex {
    public String label;
    public boolean wasVisited;

    public Vertex(String label) {
        this.label = label;
        wasVisited = false;
    }
}
