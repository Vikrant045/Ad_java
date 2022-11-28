import java.io.*;
public class fileRead {
    public static void main(String args[])throws IOException{
FileReader f = new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\file handling\\stat.txt");
int i;
while((i=f.read())!=-1){
    System.out.print((char)i);
}
f.close();
    }
    
}
