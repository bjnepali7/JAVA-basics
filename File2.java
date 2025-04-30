import java.io.FileOutputStream;
import java.io.*;

public class File2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=new FileOutputStream("a.txt",true);

        String s1= "bijay nepali";

        char c1[]=s1.toCharArray();
        for(int i=0;i<c1.length;i++){

            f1.write(c1[i]);
        }
        f1.close();
        
    }
    
}
