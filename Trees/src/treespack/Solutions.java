package treespack;

import java.util.Queue;

public class Solutions {
	
/*


boolean checkBST(Node root) {     
    return isBST(root, -1, 10001);
}   
boolean isBST(Node node,int min,int max){        
    if (node==null) return true;
    if (node.data <= min || node.data >= max) return false;    
    return isBST(node.left, min, node.data) && isBST(node.right, node.data, max);  
}

static Node lca(Node root,int v1,int v2)
{
    if(root == null)
        return root;
    if(v1>v2){
        int te = v1;
        v1=v2;
        v2=te;
    }
    Node start = root;
    while(root.data < v1 || root.data > v2){
        if(start.left == null || start.right == null)
            break;
        
        if(root.data < v1){
            start = start.right;
        }
        
        if(root.data > v2){
         start = start.left;   
        }            
        
    }     
    return start;
}



static Node lca(Node root,int v1,int v2)
{
    Node start = root;
    while(true){
        if(v1 < root.data && v2 > root.data){
            return start;
        }
        if(v1 > root.data){
            start = start.right;
        }
        if(v2 < root.data)
            start = start.left;
    }       
}


void decode(String S ,Node root)
{        
    char[] arr = S.toCharArray();
    Node start = root;
    
    char a='1';
    for(char c: arr){
        if(c == a){
            if(start.right!=null){
                start = start.right;   
            }                
           
        }
        else{
            if(start.left!=null){
                start = start.left;                
            }
           
        }
        if(start.left==null || start.right==null){
            System.out.print(start.data);
            start = root;
        }
    }   
       
}

static Node Insert(Node root,int value)
    {
        Node n = new Node();
        n.data = value;
        n.left = null;
        n.right = null;
        
        if(root==null){
            return n;
        }
        
        Node start = root;
        
        while(true){            
            if(n.data > start.data){
                if(start.right != null){
                    start = start.right;
                }
                else{
                    start.right = n;
                    break;
                }
            }
            else{
                if(start.left != null){
                    start = start.left;
                }
                else{
                    start.left = n;
                    break;
                }
            }
        }
    
        return root;
    
    }


   void LevelOrder(Node root)
    {
     
       Queue<Node> myq = new LinkedList<Node>() ;
       Node start = root;
       
       myq.add(start);
      
       while(!myq.isEmpty()){
          Node cur = myq.remove();
          
          if(cur.left!=null)        
            myq.add(cur.left);
          
          if(cur.right!=null)
            myq.add(cur.right);          
          
          System.out.print(cur.data+" ");
          
      }      
    }



void top_view(Node root)
{
   if(root.left!=null)
    call_left(root.left);
   System.out.print(root.data+" ");         
   if(root.right!=null)
    call_right(root.right);
}
void call_left(Node root){
    if(root==null)
       return;
    call_left(root.left);
    System.out.print(root.data+" ");        
}
void call_right(Node root){
    if(root==null)
       return;
    System.out.print(root.data+" ");        
    call_right(root.right);    
}




	static int getHeight(Node root) {
      	if(root==null)
            return -1;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }



void inOrder(Node root) {
        if(root == null)
        return;        
    inOrder(root.left);    
    System.out.print(root.data+" ");
    inOrder(root.right);
}



void postOrder(Node root) {

    if(root == null)
        return;        
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data+" ");
}


void preOrder(Node root) {
    if(root == null)
        return;    
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
}


*/

}
