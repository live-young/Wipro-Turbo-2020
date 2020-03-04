/*Wipro turbo 2020- Find an algorithm that takes locking key as input & output is unlocking key.
Unlocking key is smallest permutation of digits of that locking key and it never starts with zero.*/


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		String k = kb.next();
		char [] ch = k.toCharArray();
		Arrays.sort(ch);
		if(ch[0]=='0')
		{
			for(int i=1;i<ch.length;i++)
			{
				if(ch[i]!='0')
				{
					char temp = ch[0];
					ch[0]=ch[i];
					ch[i]=temp;
					break;
				}
			}
			String str = new String (ch);
			System.out.print(str);
		}
		if(ch[0]=='-')
		{
			System.out.print(ch[0]);
			for(int j = ch.length-1;j>=1;j--)
			{
				System.out.print(ch[j]);
			}
		}
	}
}
