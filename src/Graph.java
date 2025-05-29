import java.util.*;
public class Graph {

    public static void printingMatrix(int[][] arr, int vertices) {
        for(int i = 0; i < vertices; i++) {
            for(int j = 0; j < vertices; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void adjacencyMatrix(int[][] arr, int edges) {
        try (Scanner sc = new Scanner(System.in)) {
            for(int i = 0; i < edges; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[a][b] = 1;
                arr[b][a] = 1;
            }
        }
    }

    public static void adjacencyList(List<List<Integer>> Li, int vertices, int edges) {
        try (Scanner sc = new Scanner(System.in)) {
            for(int i = 0; i < vertices; i++) {
                Li.add(new ArrayList<>());
            }
            
            System.out.println("Enter edges (vertex pairs from 0 to " + (vertices-1) + "):");
            for(int i = 0; i < edges; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                if (a < 0 || a >= vertices || b < 0 || b >= vertices) {
                    System.out.println("Invalid vertex! Vertices should be between 0 and " + (vertices-1));
                    i--;
                    continue;
                }
                
                Li.get(a).add(b);
                Li.get(b).add(a);
            }
        }
    }

    public static void printingList(List<List<Integer>> Li) {
        for(int i = 0; i < Li.size(); i++) {
            System.out.println("Vertex " + i + ": " + Li.get(i));
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of vertices and edges: ");
            int vertices = sc.nextInt();
            int edges = sc.nextInt();
            
            if (vertices <= 0 || edges < 0) {
                System.out.println("Invalid input! Vertices must be positive and edges non-negative.");
                return;
            }
            
            List<List<Integer>> Li = new ArrayList<>();
            adjacencyList(Li, vertices, edges);
            printingList(Li);
        }
    }
}
