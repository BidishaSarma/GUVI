/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) { 
		char ch;
		System.out.println("enter a char: ");
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("character is an alphabet");
		}
		else
		{
			System.out.println("Not an alphabet");
		}
		
		
		
	}
}