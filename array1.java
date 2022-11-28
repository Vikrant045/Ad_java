import java.util.*;
public class array1 {

   // 1D Array
    /* 
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[]= new int[6];
        for(int i =0;i<6;i++){
            arr[i]=s.nextInt();

        }
        Arrays.sort(arr);
        for(int b:arr){
            System.out.print(b+" ");
        }

    } */


    // 2D Array
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows = ");

        int n = s.nextInt();
        System.out.print("Enter number of columns = ");

        int m = s.nextInt();

        System.out.println("Enter  Elements for "+n+" by "+m+" matrix");


        int arr[][]= new int[n][m];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
            arr[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix ..");


        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
           System.out.print(arr[i][j]+" ");           
            }
           System.out.println();           

        }
     

        
    } 

}

