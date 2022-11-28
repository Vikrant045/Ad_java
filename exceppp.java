import java.util.*;
public class exceppp {
    public static void main (String args[]) 
    {
int a = 10;
//int b= 0;
String str = "null";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num ");
        int b = sc.nextInt();
            // arithmetic
if(b==0){
    throw new ArithmeticException("divide by 0...");
}
          else{  int c = a/b;
            System.out.println(c);
        }
            // nullPointer
       
           // System.out.println("we can't divide any number with 0");

      
     
    }
    
}
