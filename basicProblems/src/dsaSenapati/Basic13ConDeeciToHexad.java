/*
 Write a Java program to convert a decimal number to hexadecimal number. 
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F 

Decimal number: The decimal numeral system is the standard system for denoting integer and non-integer numbers. It is also called base-ten positional numeral system.

Hexadecimal number: Hexadecimal is a positional numeral system with a radix, or base, of 16. It uses sixteen distinct symbols, most often the symbols 0-9 to represent values zero to nine, and A, B, C, D, E, F (or alternatively a, b, c, d, e, f) to represent values ten to fifteen.


 */
package dsaSenapati;

public class Basic13ConDeeciToHexad {
	public static void main(String args[])
    {
        int dec_num, rem;
        String hexdec_num="";
        
        /* hexadecimal number digits */
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a decimal number: ");
        dec_num = in.nextInt();
		
        while(dec_num>0)
        {
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");         
    }
}
