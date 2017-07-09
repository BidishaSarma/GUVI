import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{
	int a,b,c;
	System.out.println("enter a number:");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
if(a>b && a>c)
{
	System.out.println(a+ "is largest");
}
	else if(b>a && b>c)
	{
		System.out.println(b+"is largest");
	}
	else
	{
		System.out.println(c+"is largest");
	}
	}
}