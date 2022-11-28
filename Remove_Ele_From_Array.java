public class Remove_Ele_From_Array
 {

    public static void main(String args[])
    {
// unSorted array

/* 
        int arr[] = {1,10,19,2,3,3,4,5,6,7};

        int remove[] = new int [arr.length];
int l = arr.length;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(arr[i]==arr[j])
                {
            arr[j]=arr[l-1];
                    l--;
                }
            }
          }
          System.out.println();

          for(int i=0;i<l;i++)
          {
              System.out.print(" "+arr[i]);
          }
*/
          //Sorted array
          int arr1[] = {1,2,3,3,4,5,6,7};
          int l1 = arr1.length;
          for(int i=0;i<l1;i++)
          {
              System.out.print(" "+arr1[i]);
          }
          int j=0;
          for(int i=0;i<l1-1;i++)
          {
              if(arr1[i]!=arr1[i+1]){
                arr1[j] = arr1[i];
                j++;
              }
          }
          arr1[j]=arr1[l1-1];
          System.out.println();

          for(int i=0;i<l1-1;i++)
          {
            System.out.print(" "+arr1[i]);

          }
        }
    
}
    
