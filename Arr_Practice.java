import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;

class Arr_Practice{
    public static void main (String args[]){

      /*   Integer arr[] = {23,4,56,23,909,75,3,12,5}; 
        for(int i =0;i<arr.length;i++){
            System.out.print(" "+ arr[i]);   
           }
           System.out.println();   

        Arrays.sort(arr);
      int min = Collections.min(Arrays.asList(arr));
 int max = Collections.max(Arrays.asList(arr));

        for(int i =0;i<arr.length;i++){
         System.out.print(" "+ arr[i]);   
        }
        System.out.println();   

        System.out.println(" Minimum value in the array : "+min);   
        System.out.println(" Maximum value in the array : "+max);   
*/
Scanner sc = new Scanner(System.in);
System.out.println(" Enter number of rows..");   

             int r = sc.nextInt();
             System.out.println(" Enter number of cols..");   

             int c = sc.nextInt();

             int a[][]= new int [r][c];
             System.out.println();   

             System.out.println(" Enter elements  of 1st matrix..");   

for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        a[i][j] = sc.nextInt();
    }
}
System.out.println('\n');   

System.out.println(" Matrix 1");   

for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
  System.out.print( " "+     a[i][j]);
    }
    System.out.println();   

}    
System.out.println('\n');   

System.out.println(" Enter elements  of 2nd matrix..");   

             

             int a1[][]= new int [r][c];

for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        a1[i][j] = sc.nextInt();
    }
}
System.out.println('\n');   

System.out.println(" Matrix 2");   

for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
  System.out.print( " "+     a1[i][j]);
    }
    System.out.println();   

}
int s [][]= new int [r][c];
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
     s[i][j] =   a1[i][j] * a[i][j];
    }
}
System.out.println('\n'+'\n');   

System.out.println(" Multiplication of Matrix 1 and  Matrix 2 : ");   

for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
  System.out.print( " "+     s[i][j]);
    }
    System.out.println();   

}        









    }
}

