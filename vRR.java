import java.util.Scanner;

public class vRR {
    public static void main (String args[]){


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int [n];
   
    for(int i =0;i<arr.length;i++){

        arr[i] = sc.nextInt();
 
        
    }
    int max = arr[0];
    int min = arr[1];

    for(int i =0;i<arr.length;i++){

       // arr[i] = sc.nextInt();
       if(arr[i]>max){
max = arr[i];
       }
 
        
    }
    for(int i =0;i<arr.length;i++){

        // arr[i] = sc.nextInt();
        if(arr[i]<min){
 min = arr[i];
        }
    }
    System.out.println( "max "+max);
    System.out.println( " min "  +min);

    System.out.println( " span "  +(max-min));

    }
}
