import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{
int i,a,sum=0;
System.out.println("Enter num upto which sum is to be calc");
Scanner s=new Scanner(System.in);
a=s.nextInt();
i=0;
while(i<=a)
{
	sum=sum+i;
	i++;
}
System.out.println("sum"+sum);
	}
}