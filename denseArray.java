/*https://codeforces.com/contest/1490/problem/A*/
import java.util.Scanner;

public class A_Dense_Array{
    
    public static void main(String[] argfs){
        Scanner sc=new Scanner(System.in);
        
        int T=sc.nextInt();
        while(T-->0){
            int c=0;
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
               
            }   
            for(int i=1;i<n;i++){
                int min=Math.min(arr[i], arr[i-1]);
                int max=Math.max(arr[i],arr[i-1]);
                while(2*min<max){
                    min*=2;
                    c++;
                }
            }
            System.out.println(c);
        }
        sc.close();    
    }
}
