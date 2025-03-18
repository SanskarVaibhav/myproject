import java.util.*;
public class Graph {

    public static void printingMatrix(int arr[][],int vertices){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
        
    }
    public static void adjacencymatrix(int arr[][],int edges){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<edges;i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            arr[a][b]=1;
            arr[b][a]=1;
        }
    }
    public static void adjacencyList( List<List<Integer>> Li,int vertices,int edges){
        Scanner sc = new Scanner(System.in);
    for(int i=0;i<vertices;i++){
        Li.add(new ArrayList<>());
    }
    for(int i=0;i<edges;i++){
        int a = sc.nextInt();
        int b= sc.nextInt();
        Li.get(a).add(b);
        Li.get(b).add(a);
    }
    }
    public static void printingList(List<List<Integer>> Li){
        System.out.println(Li);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int vertices;
    int edges;
    vertices = sc.nextInt();
    edges = sc.nextInt();
    // int arr[][] = new int[vertices][vertices];
    // adjacencymatrix(arr, edges);
    // printingMatrix(arr, vertices);
    List<List<Integer>> Li = new ArrayList<>();
    adjacencyList(Li, vertices, edges);
    printingList(Li);

}
}
