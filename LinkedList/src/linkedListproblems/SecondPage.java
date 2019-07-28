package linkedListproblems;
/*
public class SecondPage {


Node Reverse(Node head) {
    Node start=head;
    Node end=head;
    int len=0,hlen=0;
    if(head==null){
        return head;
    }
    if(head.next==null){
        return head;
    }
    while(end.next!=null){
        end=end.next;
        len++;
    }
    hlen=len/2;
    while(hlen >= 0){
        
        int temp=start.data;
        start.data = end.data;
        end.data = temp;  
        
        start = start.next;
        end = end.prev;
        hlen--;
    }
    return head;
}


	Node SortedInsert(Node head,int data) {
	    Node n = new Node();
	    n.data = data;
	    n.next = null;
	    n.prev = null;
	    if(head==null){
	        return n;
	    }
	    if(head.next==null){
	        if(head.data <= n.data){
	            head.next = n;
	            n.prev = head;
	            return head;    
	        }
	        else{
	            n.next=head;
	            head.prev = n;
	            return n;
	        }
	    }
	    Node start=head;
	    while(start.next!=null){
	        if(start.next.data >= n.data){
	            n.next = start.next;
	            start.next.prev = n;
	            start.next = n;
	            n.prev = start;
	            return head;
	        }
	        start = start.next;
	    }
	    start.next=n;
	    n.prev = start;
	    return head;
	}	
	
	int FindMergeNode(Node headA, Node headB) {
	    // Complete this function
	    // Do not write the main method. 
	    Node h1=headA;Node h2=headB;
	    int l1=0,l2=0;
	    
	    while(h1!=null){
	        l1++;
	        h1=h1.next;
	    }
	    while(h2!=null){
	        l2++;
	        h2=h2.next;
	    }
	    Node ah1=headA; Node ah2=headB;
	    if(l1>l2){
	        int x=l1-l2;
	        while(x--!=0){
	            ah1=ah1.next;            
	        }
	    }
	    else if(l2>l1){
	        int x=l2-l1;
	        while(x--!=0){
	            ah2=ah2.next;
	        }
	    }
	    else{
	        
	    }
	    while(ah1 != ah2){
	        ah1=ah1.next;
	        ah2=ah2.next;        
	    }     
	    return ah1.data;
	}	
	
	
	boolean hasCycle(Node head) {
	    Node walker=head;
	    Node runner=head;
	    while(runner!=null && runner.next!=null){        
	        walker = walker.next;
	        runner = runner.next.next;
	        if(walker == runner)
	            return true;
	    }
	    return false;
	}	
	
	
}
*/
