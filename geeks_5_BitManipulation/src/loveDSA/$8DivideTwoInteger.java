/*
 *  Divide two integers without using multiplication, division and mod operator
 
 
 Given two integers say a and b. Find the quotient after dividing a by b without using multiplication, division, and mod operator.

Example: 

Input : a = 10, b = 3
Output : 3

Input : a = 43, b = -8
Output :  -5 

Approach: Keep subtracting the divisor from the dividend until the dividend becomes less than the divisor. The dividend becomes the remainder, and the number of times subtraction is done becomes the quotient. Below is the implementation of the above approach : 


 */
package loveDSA;

public class $8DivideTwoInteger {
	public static long divide(long dividend,
            long divisor)
{

//Calculate sign of divisor
//i.e., sign will be negative
//only if either one of them
//is negative otherwise it
//will be positive
long sign = ((dividend < 0) ^
(divisor < 0)) ? -1 : 1;

//remove sign of operands
dividend = Math.abs(dividend);
divisor = Math.abs(divisor);

//Initialize the quotient
long quotient = 0, temp = 0;

//test down from the highest
//bit and accumulate the
//tentative value for
//valid bit
//1<<31 behaves incorrectly and gives Integer
//Min Value which should not be the case, instead
// 1L<<31 works correctly.
for (int i = 31; i >= 0; --i)
{

if (temp + (divisor << i) <= dividend)
{
temp += divisor << i;
quotient |= 1L << i;
}
}

//if the sign value computed earlier is -1 then negate the value of quotient
if(sign==-1)
quotient=-quotient;
return quotient;
}

//Driver code
public static void main(String args[])
{
int a = 10, b = 3;
System.out.println(divide(a, b));

int a1 = 43, b1 = -8;
System.out.println(divide(a1, b1));


}
}
