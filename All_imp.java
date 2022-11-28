import java.util.*;
public class All_imp {

    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

                                                    // To print N number of Natural numbers


/*     System.out.print("Enter number : ");
         int a = sc.nextInt();
         System.out.print("Natural numbers upto "+a);


         for(int i=1;i<=a;i++){
            System.out.println(i);
         }*/

                                      // To print sum of first N number of Natural numbers


            /*    int num=0;

                 System.out.print("Enter number : ");
         int a = sc.nextInt();
         for(int i=1;i<=a;i++){
        num+=i;
         }
         System.out.println("sum of first "+a+" natural numbers "+num);
 */ 
     
/*System.out.print("Enter number : ");
int a = sc.nextInt();
for(int i=1;i<=a;i++){
    if(i%2!=0){
    System.out.print(" "+i);
}


}*/

//char c= sc.next().charAt(0);

                                                     //factorial of a number..

/* 
System.out.print("Enter any  number  : ");
         int a = sc.nextInt();

         int fact =1;

         if(a==0){
            System.out.println("Factorial of "+a+" = 1");
         }
         else{
            for(int i = 1;i<=a;i++){
                fact*=i;

            }
         }
         System.out.println("Factorial of "+a+" = "+fact);


   */
                          // calculate the digits in a number

      /*                   System.out.print("Enter any  number  : ");
         int a = sc.nextInt();
         int count=0;

         while(a>0){
            a=a/10;
            count++;
         }
         System.out.println("Digits in that number = "+count); */




                            // swap two numbers without third variable

/*

                 System.out.print("Enter  numbers  : ");
         int a = sc.nextInt(); int b = sc.nextInt();
         
         System.out.println("Before Swap..");

         System.out.println("A : "+a);
         System.out.println("B : "+b);
         System.out.println("After Swap..");
         a = a+b;
         b = a-b;
         a = a-b;
         System.out.println("A : "+a);
         System.out.println("B : "+b);
 
 
*/
                           //  reverse the number

                           System.out.print("Enter  number  : ");
                           int a = sc.nextInt();

                           while(a>0){
                            int r = a%10;
                            System.out.print(r);
                            a=a/10;
                           }

    }
    
}
