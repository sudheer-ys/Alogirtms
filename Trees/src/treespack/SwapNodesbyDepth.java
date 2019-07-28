package treespack;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SwapNodesbyDepth {

	public static final int ROOT = 1;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] tree = new int[n+1][2];
        tree[0][0] = ROOT;
        System.out.println();
        
        for(int i=1;i<n+ROOT;i++){
        	int one = sc.nextInt();
        	int two = sc.nextInt();
        	tree[i][0] = one;
        	tree[i][1] = two;
        	//System.out.println(tree[i][0]+" "+tree[i][1]);
        }
        int s = sc.nextInt();
        for(int i=0;i<s;i++){
        	int q = sc.nextInt();
        	swap(tree,ROOT,q,1);
        	//System.out.println(q);
        }
        sc.close();
        
    }
    public static void swap(int[][] tree, int node, int td, int d){
    	if(node == -1){
    		return;
    	}
    	if(d % td == 0){
    		int temp = tree[node][0];
    		tree[node][0] = tree[node][1];
    		tree[node][1] = temp;
    	}
    	swap(tree,tree[node][0],td,d+1);
    	System.out.print(node+" ");
    	swap(tree,tree[node][1],td,d+1);
    }
  
}
