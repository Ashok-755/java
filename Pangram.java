import java.util.Scanner;
import java.io.*;
public class Pangram {
	
	public static void main(String[] args)
	{
//		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=sc.nextLine();
		System.out.print(" given String is:"+"\n"+s);
		String st=removeSpace(s);
		
		int d = check(st);
		if(d==-1)
			System.out.print(s + " \nis not a pangram.");
		else
			System.out.print(s + " \nis  a pangram.");
	}
	
	public static String removeSpace(String s) {
	
				char ch[]=s.toCharArray();
				String nstr="";
				for(int i=0;i<s.length();i++)
				{
					if (ch[i]!=' ')
					{
						nstr=nstr+ch[i];
					}
				}
				return nstr;
          }
	public static int check(String st)
	{
		int n =26;
		for (char i='A';i<='Z';i++)
		{
			if((st.indexOf(i)<0)&&(st.indexOf((char)(i+32))<0))
			{
				return -1;
			}
		}
		return 1;
	}
		
			
		}


	
	
	
	
	
