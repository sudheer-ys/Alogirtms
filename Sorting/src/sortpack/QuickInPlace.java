package sortpack;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickInPlace {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	        for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	        } 
	        QuickSort(ar,0,ar.length-1);       
	    }

		public static void QuickSort(int[] ar, int left, int right) {

			if (left < right) {
		 	   int pivot = partition(ar, left, right);
		 	   printArray(ar,0,ar.length-1);		 	   
		 	   QuickSort(ar, left, pivot-1);
		 	   QuickSort(ar, pivot + 1, right);		 	   
			}
			   
		}    
	    
	    public static int partition(int[] ar, int first, int last){
	        int pivot=ar[last];
	        int cur = first;
	        
	        for(int i=first; i<last; i++){
	            if(ar[i]<pivot){
	            	swap(ar,cur,i);
	            	cur++;
	            }	           
	        }	        
	        swap(ar,cur,last);
	        return cur;
	        
	    }
	    private static void swap(int[] ar, int id1, int id2){
	    	int temp = ar[id1];
	    	ar[id1] = ar[id2];
	    	ar[id2] = temp;
	    }
	    private static void printArray(int[] ar,int l,int r) {
	        for(int i=l;i<=r;i++){
	           System.out.print(ar[i]+" ");
	        }
	          System.out.println("");
	     }	    
}
