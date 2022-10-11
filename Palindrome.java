import java.util.*;
public class Palindrome{   
      public static boolean isPalindrome(String s){
      if (s.equals(" ") || s.length() < 2){ //a string that has 0 or 1 letter is a palindrome
         return true;
      }
      else if (s.charAt(0) == s.charAt(s.length()-1)){ // checks if the first letter of the string equals the last latter of the string
         return (isPalindrome(s.substring(1,s.length()-1))); //after the first check, it checks a substring not containning the first two letters
      }                                                      // by calling itself (recursive)
      else{
         return false;
      }
   }
   public static void main (String[] args){
      String s;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a string that is a Palindrome: ");
      s = scan.next();
     
      if (isPalindrome(s))
         System.out.println("This is a palindrome: " + s); // if the recursive method is true
      else
         System.out.println("This is not a palindrome: " + s); // if the recursive method is false
   }
}
   

   
