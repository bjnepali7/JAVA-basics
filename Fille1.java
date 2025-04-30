import java.io.File;
import java.io.IOException;

public class Fille1 {
  public static void main(String[] args) throws IOException {
    File f1= new File("a.txt");
    f1.createNewFile();
    System.err.println(f1.exists());
    System.err.println(f1.canWrite());
    System.err.println(f1.length());

    
  }  
}
