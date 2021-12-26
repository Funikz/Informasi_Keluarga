package GraphClass;

public class Graph {

    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;

    public Graph() {                            // Constructor
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(String label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;

    }

    public String display() {
        String[] tampil = new String[20];
        int t = 0;
        for (int row = 0; row < nVerts; row++) {
            for (int col = 0; col < nVerts; col++) {
                if (adjMat[row][col] == 1) {
                    tampil[t] = (vertexList[row].label + " --> " + vertexList[col].label);
                    t++;
                }
            }
        }

        String show = (tampil[0] + "\n" + tampil[1] + "\n" + tampil[2]);
        return show;
    }

}
