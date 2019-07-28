package sortpack;
import java.util.*;

public class Quick1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        } 
        printQuick(ar);
    }
    public static void printQuick(int[] ar){
        int p=ar[0];
        int n = ar.length;
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        
        for(int i=1; i<ar.length; i++){
            if(ar[i]<p){
                left.add(ar[i]);        
            }
            else{
                right.add(ar[i]);
            }
        }
        for(int i:left){
            System.out.print(i+" ");
        }
            System.out.print(p+" ");
        for(int i:right){
            System.out.print(i+" ");
        }
    }
}