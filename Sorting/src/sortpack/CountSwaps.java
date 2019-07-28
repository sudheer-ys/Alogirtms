package sortpack;
import java.util.*;

public class CountSwaps {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        System.out.println(countSwaps(ar));
    }
	public static int countSwaps(int[] ar)
    {       
        int swaps=0;   
        for(int i=1; i<ar.length;i++){
               int x = ar[i];
               int j = i-1;
               while(j+1 > 0 && x < ar[j]){
                   ar[j+1] = ar[j];
                   j = j-1;
                   swaps++;
               }
               ar[j+1] = x;               
           }
        return swaps;
    }     
}