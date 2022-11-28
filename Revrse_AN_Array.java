public class Revrse_AN_Array {

    public static void main(String args[])
    {
        int arr[] = {1,10,19,2,3,3,4,5,6,7};
        for (int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
        int i = 0;
        int j = arr.length-1;

       while(i<j){
        int temp = arr[i];
        arr[i]=arr[j];
arr[j]= temp;
i++;
j--;
       }
       System.out.println(" "0);

       for (int k=0;k<arr.length;k++){

        System.out.print(" "+arr[k]);
    }
    }
    
}
