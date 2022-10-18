//Check whether a String is Palindrome or not
//A string is said to be palindrome if the reverse of the string is the same as the string. For example, “abba” is a palindrome because the reverse of “abba” will be equal to “abba” so both of these strings are equal and are said to be a palindrome, but “abbc” is not a palindrome.

//There are multiple methods to check palindromic strings such as:

//Using the standard (simple) method
//Using function in C
//Using String library function of reverse and compare in C
//Using Recursion
package loveDSA;

public class $2CheckPelindrom {
	public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
}
