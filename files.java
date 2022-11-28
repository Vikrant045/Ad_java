import java.io.*;
public class files {
    public static void main(String args[]){
        try{
            FileWriter f = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\file handling\\stat.txt");

          /*   if(f.createNewFile()){
                System.out.println("your file is created...");
            }
            else{
                System.out.println("already exists..");
            } */

            // Write operation
            try{
                f.write("hello vikrant..");
            }
            finally{
                f.close();
            }
            System.out.println(" Sucessfully wrote in the file ");

        }
        catch(IOException e){
            System.out.println(e);
  
        }
    }

    
}
