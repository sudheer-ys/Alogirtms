package linkedListproblems;
import java.util.*;

class myNode{
	int data;
	myNode next;
	myNode random;
	myNode(int d){
		this.data =d;
	}
}
public class CloneList {

	public static myNode Insert(myNode head,int data) {
        myNode n = new myNode(data);
        n.next = null;
        n.random = null;
		
        if(head == null){
	       return n;
	   }
	    myNode x=head;
	    while(head.next!=null){        
	        head=head.next;
	    }
	    head.next = n;
	    return x;
	  
	}
	public static void setRandom(myNode root){
		
		myNode start = root;
		
		myNode m1 = root;		
		m1.random = start.next.next;
		//System.out.print(m1.random.data+" ");
		
		
		myNode m2 = root.next;
		start = root;		
		m2.random = start;
		//System.out.print(m2.random.data+" ");
		
		
		start = root;
		myNode m3 = root.next.next;
		m3.random = start.next.next.next.next;
		//System.out.print(m3.random.data+" ");
		
		start = root;
		myNode m4 = root.next.next.next;
		m4.random = start.next.next;
		//System.out.print(m4.random.data+" ");
		
		start = root;
		myNode m5 = root.next.next.next.next;
		m5.random = start.next;
		//System.out.print(m5.random.data+" ");
		
	}
	public static void printLinkedList(myNode root){
		myNode d = root;		
		System.out.println();
		while(d!=null){
			System.out.println("Data: "+d.data+" Random: "+d.random.data);
			d = d.next;
		}		
	}
	public static myNode cloneLinkedList(myNode root){
		
		myNode sroot=null;
		myNode start = root;
		int count = 0;
		
		while(start!=null){						
			count++;
			myNode c = new myNode(start.data);
			c.next = start.next;
			start.next = c;			
			start=start.next.next;
		}
		
		start = root;
		while(start!=null){
			if(start.random !=null)
				start.next.random = start.random.next;
			else
				start.next.random = null;
			start = start.next.next;
		}
		
		start = root;
		myNode newHead = start.next;
		myNode sstart = newHead;
		while(sstart!=null){
			
			start.next = sstart.next;
			
			if(sstart.next!=null)
				sstart.next = sstart.next.next;
			
			start = start.next;
			sstart = sstart.next;
		}
		return newHead;
	}
	public static void main(String[] args) {
		
		myNode root = null;
		root = Insert(root,15);
		root = Insert(root,25);
		root = Insert(root,35);
		root = Insert(root,45);
		root = Insert(root,55);
				
		setRandom(root);
		printLinkedList(root);
		
		
		myNode dup=null;
		dup=cloneLinkedList(root);
		printLinkedList(dup);
	
	}

}
