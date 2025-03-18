import java.util.*;


public class Tree{
public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
    int idx=-1; 
    //  create a function to build tree
    public Node buildtree(int nodes[]){
                         idx++;
        if(nodes[idx]==-1){
            return null;
        }
       
        Node newnode = new Node(nodes[idx]);
        newnode.left = buildtree(nodes);
        newnode.right = buildtree(nodes);

        return newnode;
    }
    // function to create preorder 
    public void Preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    // function to create Inorder 
    public void Inorder(Node root){
        if(root==null){
            return;
        }
        Preorder(root.left);
        System.out.print(root.data+" ");
        Preorder(root.right);
    }
    // function to create Postorder
    public void Postorder(Node root){
        if(root==null){
            return;
        }
        Preorder(root.left);
        Preorder(root.right);
        System.out.print(root.data+" ");
    }
    // function to create Levelorder 
public void Levelorder(Node root){
    if(root==null){
        return;
    }
Queue <Node> queue = new LinkedList<>();
queue.add(root);
while(!queue.isEmpty()){
 Node curr = queue.poll();
 System.out.print(curr.data + " ");
 if(curr.left!=null){
    queue.add(curr.left);
 }
 if(curr.right!=null){
    queue.add(curr.right);
 }
}
}
// function to find height of the tree
public int Height (Node root){
    if(root == null){
        return 0 ;
    }
int left = Height(root.left);
int right = Height(root.right);

return  Math.max(left,right)+1;
}
// function to count nodes of the tree
public int Countnodes(Node root){
    if (root == null){
        return 0;
    }
    int left = Countnodes(root.left);
    int right = Countnodes(root.right);

    return left+right+1;
}
// function to get the diameter of the tree
public int diameter (Node root){
    if(root == null){
        return 0;
    }
    int left = Height(root.left);
    int right = Height(root.right);

    return left+right+1;
}
// function to get tree is balanced or not
public boolean  balanced (Node root){
    if(root == null){
        return false ;
    }
int left = Height(root.left);
int right = Height(root.right);

 if(Math.abs(left-right)>1){
    return false;
 }
 return true;
}


    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,7,-1,-1,5,-1,3,-1,6,-1,-1};
        Tree t1 = new Tree();
        Node root = t1.buildtree(arr);
        System.out.println("build tree "+root.data);
        t1.Preorder(root);
        System.out.println();
        t1.Inorder(root);
        System.out.println();
        t1.Postorder(root);
        System.out.println();
        t1.Levelorder(root);
        System.out.println();
        System.out.println(t1.Height(root));
        System.out.println(t1.Countnodes(root));
        System.out.println(t1.diameter(root));
        System.out.println(t1.balanced(root));
    }

}
