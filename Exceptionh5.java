import java.io.*;
// comile time exceptiom
// comile time  exception are io exception, class not found exception, sql exception
public class Exceptionh5 {

    public static void main(String[] args)  throws IOException,ClassNotFoundException{//throws is used to  tell java redy for handaling exception it is used for 
        // unchecked exception (compile time exception)
        //  if it is not write it tells eoor and we confuse which eorror
        try{
            System.err.println("a");
            throw new IOException("hello i am exception");
            
        }
        catch(IOException e1){
            System.err.println(e1.getMessage());
        }

        
    }
    
}
