import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args)
	{
 int year;
 System.out.println("enter the year");
 Scanner s=new Scanner(System.in);
 year=s.nextInt();
    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
        	System.out.println("Year " + year + " is a leap year");
        	}
    else
        {
        	System.out.println("Year " + year + " is not a leap year");
        }
        }
}
