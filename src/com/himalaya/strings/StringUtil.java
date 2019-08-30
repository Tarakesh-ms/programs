import java.io.*;
import java.util.*;

public class StringUtil {

  public static void main(String[] args) { 
      hasUniqueCharacters("Nature");
      hasUniqueCharacters("No problem");
      hasUniqueCharacters("Win");

      isPermutation("Nature", "Nat");
      isPermutation("GOD", "DOG");
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

  private static String sort(String str){
      char [] content = str.toCharArray();
      Arrays.sort(content);
      return new String(content);
  }

  private static boolean isPermutation(String s, String t){

      if(s.length() != t.length()){
        System.out.println("\"" + s + "\"" + "and \"" + t + "\"" + "is not a permuatation");
        return false;
      }

      if(sort(s).equals(sort(t))){
          System.out.println("\"" + s + "\"" + "and \"" + t + "\"" + "is a permuatation " );
          return true;
      }
      else{
           System.out.println("\"" + s + "\"" + "and \"" + t + "\"" + "is not a permuatation");
           return false;
      }
  }
}
