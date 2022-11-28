public class FrequencyOf_Array {

    public static void main(String args[]){

        int arr[] = {1,12,2,1,1,5,2,2,5};

        int Frequency[] = new int [arr.length];
int visited = -1;
        for(int i = 0;i<arr.length;i++){
            int count =1;
            for(int j = i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    count++;
                    Frequency[j]= visited;
                }


            }
            if(Frequency[i]!=visited){
                Frequency[i]=count;
            }
        }
        for(int i = 0;i<Frequency.length;i++){

            if(Frequency[i]!=visited){
                System.out.println("Elements  frequency");
                System.out.println(arr[i]+"         "+Frequency[i]);

            }
        }
      //  int count =0;


    }
    
}
