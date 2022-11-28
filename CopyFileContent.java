import java.io.*;
public class CopyFileContent {
    public static void main(String args[]) throws IOException{
        FileInputStream r = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\file handling\\stat.txt");
        FileOutputStream w = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\file handling\\Newfile.txt");
        int i;
        while((i=r.read())!=-1){
            w.write((char)i);
        }
        System.out.println("Content copied sucesssfully..");
        r.close();
        w.close();
    }

    
}
