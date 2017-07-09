import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
 class Ideone
{
	public static void main (String[] args)
	{
	int i=0;
	System.out.println("enter alphabet:");
	Scanner s=new Scanner(System.in);
	char ch=s.next().charAt(0);
	switch(ch)
	{
	    case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':	
		case 'I':
		case 'O':
		case 'U':i++;break;
	}
	if(i==1)
	{
		System.out.println("vowel");
	}
	else if((ch>'a' && ch<'z')||(ch>'A' && ch<'Z'))
	{
		System.out.println("consonant");
	}
else
{
	System.out.println("Not an alphabet");
}
	
	}
}