//https://codeforces.com/contest/1490/problem/C
import java.util.*;

class C_Sum_of_Cubes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long n=sc.nextLong();
            boolean a=Check(n);
            if(a==true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
    public static boolean Check(long n){
        for(long i=1;i*i*i<n;i++){
            double x;
            long y;
            x=Math.cbrt(n-Math.pow(i,3));
            y=(long) x;
            if(x-y==0){
                return true;
            }
        }
        return false;
    }

}
