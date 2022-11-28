

class A

{
   
public static void main(String args[]){
int n=4,m=5;
 //decreasing triangle
/*for(int i=1;i<=n;i++)
{
for(int j=4;j>i;j--)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print("*");
}
System.out.println("");

}
//outer square 

for(int i=1;i<=4;i++)
{
    for(int j=1;j<=5;j++)
{
    if(i==1||j==2||i==n||j==m){
        System.out.print("*");

    }
    else{
        System.out.print(" ");
 
    }

    
}
System.out.println();

}

//triangle 
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++ ){
        System.out.print("*");

    }
    System.out.println();

}
for(int i=1;i<=n;i++){
    for(int j=i;j<=4;j++ ){
        System.out.print("*");

    }
    System.out.println();

}

    
    // inverted pyramid with numbers  pattern
    for(int i=1;i<m;i++)
    {
        for(int j=i;j<m;j++)
        {
            System.out.print(j);
        }
        for(int k=i;k<=i+1;k++)
        {
            System.out.print(" ");
            }
        
        System.out.println();


    }
    //floyd Triangle
    int num =1;
    for(int i=1;i<m;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print( " "+num+" " );
            num++;
        }
       
        System.out.println();


    }
    //0 1 triangle
    int num =1;
    for(int i=1;i<m;i++)
    {
        for(int j=1;j<=i;j++)
        {
          int   sum=i+j;
          if(sum%2==0){

            System.out.print( " 1 " );
        }
        else{
            System.out.print( " 0 " );


        }
           
        }
       
        System.out.println();
    }*/

    // diamond 

    for(int i=1;i<=m;i++)
    {
        for(int j=5;j>i;j--)
        {
System.out.print(" ");
        
        }
        for(int k=1;k<=2*i-1;k++)
        {
            System.out.print("*");
 
        }
        System.out.println("");

    
    }
    //lower
    
    for(int i=4;i>=1;i--)
    {
        for(int j=5;j>i;j--)
        {
System.out.print(" ");
        
        }
        for(int k=1;k<=2*i-1;k++)
        {
            System.out.print("*");
 
        }
        System.out.println("");

    
    }
    
    }

    }




