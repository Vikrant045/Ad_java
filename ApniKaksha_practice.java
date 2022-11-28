import java.util.*;

/*/ Average of threee numbers taking from user
class D{
    public static void main(String args []){
        D f = new D();
        f.average();
       
    }
    public void average()
    {
        Scanner sc = new Scanner( System.in);
        System.out.print("enter first number = ");
        int a=sc.nextInt();
        System.out.print("enter second number = ");
        int a1=sc.nextInt();
        System.out.print("enter third number = ");
        int a2=sc.nextInt();
        int avg = (a+a1+a2)/3;
        System.out.print("Average of numbers = "+avg);


    }
}    */

// Sum of all odd numbers from 1 to n
class OOD{
    public static void main(String args []){
        OOD od = new OOD();
        od.ood_num();
       
    }
    public void ood_num()
    {
        int sum = 0;
        Scanner sc = new Scanner( System.in);
        System.out.print("enter  number  = ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if((i%2)!=0){
                sum+=i;
            }
        }
        System.out.print("sum of all odd numbers from 1 to "+n+" = "+sum);
    
} 
}
 
  