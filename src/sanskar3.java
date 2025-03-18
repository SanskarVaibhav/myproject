import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class sanskar3 
{
    static int n,c;
    static List<Integer>expertise;
    static List<List<Integer>> adj;
    static boolean[] visited;
    static void dfs(int node,List<Integer> component)
    {
        visited[node] =true;
        component.add(node);
        for(int neighbor : adj.get(node))
        {
            if(!visited[neighbor])
            {
                dfs(neighbor, component);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner =new Scanner(System.in);
        n=scanner.nextInt();
        c=scanner.nextInt();
        adj = new ArrayList<>(n);
        expertise = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<c;i++){
            int u =scanner.nextInt() -1;
            int v = scanner.nextInt() -1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for(int i=0;i<n;i++){
            expertise.add(scanner.nextInt());
        }
        visited = new boolean[n];
        int max_total_expertise =0;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                List<Integer> component = new ArrayList<>();
                dfs(i, component);
                int component_size = component.size();
                int max_expertise_component =0;
                int subset_count =1 << component_size;
                for(int mask =0; mask < subset_count;mask++){
                    boolean conflict =false;
                    int sum_expertise =0;
                    for(int j=0;j<component_size;j++){
                        if((mask & (1<<j)) !=0){
                            sum_expertise += expertise.get(component.get(j));
                            for(int k=j+1;k<component_size;k++){
                                if((mask &(1<<k)) !=0){
                                    if(adj.get(component.get(j)).contains(component.get(k))){
                                        conflict= true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (conflict) break;
                    }
                    if(!conflict){
                        max_expertise_component = Math.max(max_expertise_component, sum_expertise);
                    }
                }
                max_total_expertise += max_expertise_component;
            }
        }
        scanner.close();
        System.out.print(max_total_expertise);
    }
}
