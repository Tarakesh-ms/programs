import java.io.*;
import java.util.*;

public class StringUtil {

  public static void main(String[] args) { 
      hasUniqueCharacters("Nature");
      hasUniqueCharacters("No problem");
      hasUniqueCharacters("Win");
  }
  
  private static boolean hasUniqueCharacters(String string){
    
      if(string == null){ 
        System.out.println("not a valid string");
        return false;
      }

      if(string.length() > 256){
         System.out.println("not a valid string");
         return false;
     }

      boolean [] charArray = new boolean[256];

      for(int i=0; i< string.length(); i++){

          int val = string.charAt(i);
          
          if(charArray[val]){
             System.out.println(string + " ==> doesn't have unique characters");            
             return false;
           }
       
        charArray[val] = true;
    }
     System.out.println(string + " ==> has unique characters"); 
     return true;
  }
}
