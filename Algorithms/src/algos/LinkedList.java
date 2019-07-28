package algos;
import java.util.*;
import java.io.*;

class Node{
	int data;
	Node next;
	Node(int n){
		data = n;
		next = null;
	}
}
public class LinkedList {
	public static void display(Node n){
		Node start = n;
		while(start!=null){
			System.out.println(start.data+" ");
			start = start.next;
		}
	}
	public static Node insert(Node head,int data){
		 Node n = new Node(data);
	     Node t = head,x = null;
	     if(t==null){
	         head = n;
	         return head;
	       }
	     while(t!=null){
	         x=t;
	         t = t.next;
	        }
	        x.next = n;	        
	        return head;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Node head=null;
		while(t-- > 0){
			int ele = sc.nextInt();
			head = insert(head,ele);
		}
		display(head);
		sc.close();

	}

}
