package Graph;
import java.util.*;
public class BFS_Util {
    static class Edge{
        int src; 
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(6, 5, 1));


    }

    public static void bfs(ArrayList<Edge>[] graph){ // This Code For When Multiple Graph in a Single Graph
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                bfsutil(graph, vis);
            }
        }
    }
    public static void bfsutil(ArrayList<Edge>[] graph, boolean vis[]){ // T.C = O(V+E)
        Queue<Integer> q= new LinkedList<>();
        q.add(0); // Source = 0
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){ // visit curr 
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){ // For Adding Nodes Neighabour in Queue
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }  
            }
        }
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        bfs(graph);
    }
}
