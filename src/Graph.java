class Graph {
    class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    int vertices, NoOfEdges;
    Edge[] e;

    public Graph(int vertices, int NoOfEdges) {
        this.vertices = vertices;
        this.NoOfEdges = NoOfEdges;

        e = new Edge[NoOfEdges];
        for (int i = 0; i < NoOfEdges; i++) {
            e[i] = new Edge(0, 0);
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        int NoOfEdges = 7;

        Graph g = new Graph(vertices, NoOfEdges);

        g.e[0].src = 1;
        g.e[0].dest = 2;

        g.e[1].src = 1;
        g.e[1].dest = 3;

        g.e[2].src = 2;
        g.e[2].dest = 3;

        g.e[3].src = 2;
        g.e[3].dest = 5;

        g.e[4].src = 3;
        g.e[4].dest = 5;

        g.e[5].src = 4;
        g.e[5].dest = 3;

        g.e[6].src = 4;
        g.e[6].dest = 1;

        for(int i=0;i<NoOfEdges ;i++){
            System.out.println(g.e[i].src +"->"+g.e[i].dest );
        }
    }
}
