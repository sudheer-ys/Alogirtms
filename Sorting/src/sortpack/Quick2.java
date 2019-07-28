package sortpack;

import java.util.ArrayList;
import java.util.Scanner;

public class Quick2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        } 
        QuickSort(ar,0,ar.length);       
    }

	public static void QuickSort(int[] array, int left, int right) {

		if (right - left >= 2) {
	 	   int pivot = partition(array, left, right);
	 	   QuickSort(array, left, pivot);
	 	   QuickSort(array, (pivot + 1), right);
	 	   printArray(array, left, right);
		}
	}    
    
    public static int partition(int[] ar, int first, int last){
        int pivot=ar[first];
        
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        
        for(int i=first+1; i<last; i++){
            if(ar[i]<pivot){
                left.add(ar[i]);        
            }
            else{
                right.add(ar[i]);
            }
        }
        
        for(int i=0; i<left.size();++i)
        	ar[first+i] = left.get(i);
        
        ar[first+left.size()] = pivot;
        
        for(int i=0; i<right.size();++i)
        	ar[first+left.size()+1+i] = right.get(i);
        
        return first+left.size();
        
    }
    private static void printArray(int[] ar,int l,int r) {
        for(int i=l;i<r;i++){
           System.out.print(ar[i]+" ");
        }
          System.out.println("");
     }	    
}
