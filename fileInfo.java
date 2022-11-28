import java.io.*;
public class fileInfo {
    public static void main(String args[]){
        File f = new File("C:\\Users\\HP\\OneDrive\\Desktop\\file handling\\stat.txt");
        if(f.exists()){
            System.out.println("file name "+f.getName());
            System.out.println("file path "+f.getAbsolutePath());
            System.out.println("file length "+f.length());
            System.out.println("file readable or not "+f.canRead());



        }
        else{
            System.out.println("file does not exists...");
        }
    }
    
}
