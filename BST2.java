class Node{
    int key;
    Node left,right;
 public Node(int key){
        this.key=key;
        left=right=null;
    }
}
class BST {
    static Node insert(Node root,int key){
        if(root==null)
          return ( new Node(key)); 
        if(root.key==key)
          return root;
        if(key>root.key)
          root.right=insert(root.right,key);
        else
          root.left=insert(root.left,key);
        return root;
    }
    static void inorder(Node root)
    {
        if(root!=null)
        {
          inorder(root.left);
          System.out.println(root.key);
          inorder(root.right);
        }
    }
    static void preorder(Node root){
         if(root!=null)
        {
          System.out.println(root.key);
          preorder(root.left);
          preorder(root.right);
        }

    }
     static void postorder(Node root){
         if(root!=null)
        {
          postorder(root.left);
          postorder(root.right);
          System.out.println(root.key);
    
        }
     }
     public static void main(String args[]){
        Node root=null;
        root=insert(root,30);
        root=insert(root,40);
        root=insert(root,50);
        root=insert(root,12);
        root=insert(root,120);
        root=insert(root,35);
        root=insert(root,15);
        root=insert(root,18);
        System.out.println("inorder");
        inorder(root);
        System.out.println("preorder");
        preorder(root);
        System.out.println("postorder");
        postorder(root);

     }
}