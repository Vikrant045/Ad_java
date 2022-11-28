public class Encaps {
    
    public static void main(String args[]){
        Demo s = new Demo();
        s.setRoll_no(6020);
       int f = s.getRoll_no() ;
       System.out.println("roll no = "+f);

    }


}
 class Demo {

    private int Roll_no ;
    private String name;

    
    public void setRoll_no(int roll){
        this.Roll_no=roll;

    }
    public int getRoll_no(){
        return this.Roll_no;
    }
}
