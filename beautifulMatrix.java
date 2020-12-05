import java.util.Scanner;
 
public class beautifulMatrix {
    public static void main(String arfs[]){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[5][5];
        int i1=0,j1=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1){
                  i1=i;
                  j1=j;
                }
            }
        }
        System.out.println(Math.abs(i1-2)+Math.abs(j1-2));
    }
}
