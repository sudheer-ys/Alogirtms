package linkedListproblems;
import java.util.*;
class Node{
	int data;
	Node next;
}
public class Solutions {

	public static void main(String[] args) {

	}
		
	
	Node Insert(Node head,int data) {
		// This is a "method-only" submission. 
		// You only need to complete this method.          
		        Node n = new Node();
		        n.data = data;
		        n.next = null;
		    if(head == null){
		        return n;
		    }
		    Node x=head;
		    while(head.next!=null){        
		        head=head.next;
		    }
		    head.next = n;
		    return x;
		  
		}
	/*Node Insert(Node head,int x) {
	    Node n = new Node();
	    n.data = x;
	    n.next = head;   
	    return n;
	}*/
	
	Node InsertNth(Node head, int data, int position) {
		   // This is a "method-only" submission. 
		    // You only need to complete this method. 
		    Node n = new Node();
		    n.data = data;
		    n.next = null;

		    Node start = head;
		    if(position == 0){                
		        n.next = head;
		        return n;
		    }
		    else{
		        while(--position!=0){
		            start = start.next;
		        }
		        n.next = start.next;
		        start.next = n;
		        return head;
		    }
		}
	
	Node Delete(Node head, int position) {
		  if(position==0){
		      return head.next;
		  }
		  else{
		      Node start = head;
		      while(--position !=0){
		          start=start.next;
		      }
		      start.next = start.next.next;
		      return head;
		  }

		}
	
	void ReversePrint(Node head) {
		  // This is a "method-only" submission. 
		  // You only need to complete this method. 
		    Stack<Integer> stk = new Stack<>();
		    Node start = head;
		    while(start!=null){
		        stk.push(start.data);
		        start = start.next;        
		    }
		    while(!stk.empty()){
		        System.out.println(stk.pop());
		    }
		    
		}
	
	Node Reverse(Node head) {
	    Stack<Integer> stk = new Stack<>();
	    Node start = head;
	    while(start!=null){
	        stk.push(start.data);
	        start = start.next;        
	    }
	    Node end = head;
	    while(end!=null){
	        end.data = stk.pop();
	        end = end.next;
	    }
	    return head;
	}

	int CompareLists(Node headA, Node headB) {
	    // This is a "method-only" submission. 
	    // You only need to complete this method 
	    Node one = headA;
	    Node two = headB;
	    int ans=1;
	    while(one!=null){
	        if(two==null)
	            ans=0;
	        if(one.data!=two.data)
	            ans=0;
	        one = one.next;
	        two = two.next;
	    }
	    if(two!=null)
	        ans=0;
	    return ans;
	}
	
	
Node MergeLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
   Node h1=headA;
   Node h2=headB;
   
   Node mergedList = new Node();
   Node p =mergedList;
   
   while(h1!=null && h2!=null){
       if(h1.data < h2.data){
           p.next = h1;
           h1=h1.next;
       }        
       else{
           p.next = h2;
           h2=h2.next;
       }
       p = p.next;        
   }
   if(h1==null){
       p.next = h2;
   }
   else{
       p.next = h1;
   }
   return mergedList.next;
}
}
