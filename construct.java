public class construct {
    int a;
    int nm ;
    construct(int f,int g){
        a=f;
        nm=g;
    }
    construct(String f1,String g1){
       System.out.println(f1+" "+g1);
    }
    void show (){
        System.out.println(a+" "+nm);
    }
   public static void main(String args[])
   {
    construct h = new construct(100,45);
    h.show();
    construct hv = new construct("cv","wd");


   }
    
}
