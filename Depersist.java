import java.io.*;
import java.io.FileInputStream;  
class Depersist
{  
 public static void main(String args[])throws Exception{  
    
  fileInputStream fin=new FileInputStream("f.txt");
  ObjectInputStream in=new ObjectInputStream(fin);  
  Student s=(Student)in.readObject();  
  System.out.println(s.id+" "+s.name);  
  
  in.close();  
  fin.close();
 }  
}  