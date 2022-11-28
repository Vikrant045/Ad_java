 import java.lang.*;
 class A extends Thread{

    public void run(){
        
        // String name = Thread.currentThread().getName();
         for(int i =1;i<=4;i++){
            System.out.println(i+"rrr");
         }
        
       
    }
}
public class threadds {
    public static void main(String args[]){
         A t1 = new A();
         t1.start();
         try{
            t1.join();
         }
         catch(InterruptedException e){
            
         }
         /*A t2 = new A();
         A t3 = new A();
         A t4 = new A();
         
         t1.setName("Vikrant");
         t2.setName("Ajju");
         t3.setName("Divyansh");
         t4.setName("Rohit");
        
          t1.start();
          t2.start();
          t3.start();
          t4.start();*/
          for(int i =1;i<=4;i++){
            System.out.println(i+"mmm");
         }
        







    }
    
}
