import java.util.*;

public class GraphOperations {

    private int vertices;
    private int[][] adjacencyMatrix;
    public GraphOperations(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
    }
    // Task 1: Add Edge to the Graph
    public void addEdge(int u, int v) {
        adjacencyMatrix[u - 1][v - 1] = 1; // Directed graph (change for undirected)
    }
    // Task 2: Display Adjacency Matrix
    public void displayAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Task 3: Find Shortest Path Using BFS
    public void findShortestPath(int start, int destination) {
        boolean[] visited = new boolean[vertices];
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start - 1);
        visited[start - 1] = true;
        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == destination - 1) break;

            for (int i = 0; i < vertices; i++) {
                if (adjacencyMatrix[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    parent[i] = current;
                    queue.add(i);
                }
            }
        }
        // Backtrack to find the path
        List<Integer> path = new ArrayList<>();
        for (int at = destination - 1; at != -1; at = parent[at]) {
            path.add(at + 1);
        }
        Collections.reverse(path);
        if (path.get(0) == start) {
            System.out.println(path);
            System.out.println((path.size() - 1));
        } else {
            System.out.println(start+ destination);
        }
    }
    // Task 4: Find All Paths Between Two Vertices
    public void findAllPaths(int start, int destination) {
        boolean[] visited = new boolean[vertices];
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> allPaths = new ArrayList<>();
        dfsFindAllPaths(start - 1, destination - 1, visited, path, allPaths);
        for (List<Integer> p : allPaths) {
            System.out.println(p + " (Length: " + (p.size() - 1) + ")");
        }
    }
    private void dfsFindAllPaths(int current, int destination, boolean[] visited,
                                 List<Integer> path, List<List<Integer>> allPaths) {
        visited[current] = true;
        path.add(current + 1);

        if (current == destination) {
            allPaths.add(new ArrayList<>(path));
        } else {
            for (int i = 0; i < vertices; i++) {
                if (adjacencyMatrix[current][i] == 1 && !visited[i]) {
                    dfsFindAllPaths(i, destination, visited, path, allPaths);
                }
            }
        }

        visited[current] = false;
        path.remove(path.size() - 1);
    }

    // Task 5: Detect Connected Components
    public void detectConnectedComponents() {
        boolean[] visited = new boolean[vertices];
        List<List<Integer>> components = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfsConnectedComponents(i, visited, component);
                components.add(component);
            }
        }
        for (List<Integer> component : components) {
            System.out.println(component);
        }
    }
    private void dfsConnectedComponents(int current, boolean[] visited, List<Integer> component) {
        visited[current] = true;
        component.add(current + 1);
        for (int i = 0; i < vertices; i++) {
            if (adjacencyMatrix[current][i] == 1 && !visited[i]) {
                dfsConnectedComponents(i, visited, component);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertices = scanner.nextInt();
        GraphOperations graph = new GraphOperations(vertices);
        int edges = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < edges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addEdge(u, v);
        }
        graph.displayAdjacencyMatrix();
        System.out.print("Enter start and destination for shortest path: ");
        int start = scanner.nextInt();
        int destination = scanner.nextInt();
        graph.findShortestPath(start, destination);
        System.out.print("Enter start and destination");
        start = scanner.nextInt();
        destination = scanner.nextInt();
        graph.findAllPaths(start, destination);
        graph.detectConnectedComponents();
        scanner.close();
    }
}