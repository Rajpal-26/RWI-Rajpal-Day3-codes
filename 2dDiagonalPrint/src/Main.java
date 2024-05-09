import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of rows");
        int m = sc.nextInt();
        System.out.println("Enter the value of columns");
        int n = sc.nextInt();

        int arr[][]= new int [m][n];
        int brr[][] = new int [m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        FirstDiagonalPrint(m,n,arr);
        SecondDiagonalPrint(m,n,brr);
    }
    public static void FirstDiagonalPrint(int m,int n,int arr[][]){
        System.out.println("First Diagonal ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i+j)%2==0 && i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
    }
    public static void SecondDiagonalPrint(int m,int n,int brr[][]){
        System.out.println("Second Diagonal");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i+j)==(m-1)){
                    System.out.print(brr[i][j]+" ");
                }
            }
        }
    }

}