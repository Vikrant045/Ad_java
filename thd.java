
/*class A extends Thread{
//@Override
    public void r1(){
        try{
        for(int i =0;i<5;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    catch(Exception e){

    }
    }
}*/
class Bevo implements Runnable{
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println(i);
           
        }

    }

}
 class thd {
    public static void main (String args[])throws InterruptedException{
Bevo b1 = new Bevo();
Thread th1 = new Thread(b1);
th1.start();
        for(int j =5;j<11;j++){
            System.out.println(j);
          //  Thread.sleep(1000);
 
        }

    }
    
}
