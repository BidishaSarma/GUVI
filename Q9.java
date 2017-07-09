import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{
	int i,a;
	int sum=0;
	System.out.println("enter the number upto which sum is to be calculated:");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	for(i=0;i<=a;i++)
	{
		sum=sum+i;
	}
	}
}
