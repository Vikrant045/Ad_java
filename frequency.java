public class frequency {
    public static void main(String args[]){

        int a[] = {1,5,6,1,1,8,6,6,21};

        int Frequency[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            System.out.println(" "+a[i]);

        }
int visited = -1;
    for(int i=0;i<a.length;i++){
        int count =1;
        for(int j=i+1;j<a.length;j++){
           
            if(a[i]==a[j]){
                count++;
               Frequency[j]= visited;
            }
        }
        if(Frequency[i]!=visited){
            Frequency[i]=count;

        }
    }
    for(int i=0;i<Frequency.length;i++){
        if(Frequency[i]!=visited){
            System.out.println("Elements  Frequency");
            System.out.println(a[i]+"           "+Frequency[i]);

        }

    }
}
}
