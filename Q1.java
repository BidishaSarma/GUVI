/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{ 
int a;
System.out.println("Enter a number:");
Scanner s=new Scanner(System.in);
a=s.nextInt();
if(a>0)
{
System.out.println("Number is positive");	
}
else if(a<0)
{
	System.out.println("Number is negative");
}
else 
{
System.out.println("Number is zero");	

}
	}
	
}