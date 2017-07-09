import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a;
	System.out.println("enter number:");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	if(a%2==0)
	{
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
	}
}