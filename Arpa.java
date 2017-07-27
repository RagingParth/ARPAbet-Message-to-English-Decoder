import java.io.*;
import java.util.*;
import java.lang.*;

public class Arpa
{
	public static void main(String args[])throws IOException
	{
		try
		{
		Scanner ip=new Scanner(System.in);
		File input=new File("Input File.txt");
		ip=new Scanner(input);

		StringBuilder sbin=new StringBuilder();

		System.out.println("\n\nCS610 Data Structures & Algorithms\nProject 1: ARPAbet Translation\nDeveloped by: PARTH KETAN MEHTA\nProfessor: James Calvin\n");

		while(ip.hasNextLine())
		{
			String line2=ip.nextLine();
			sbin.append(line2);
		}
		System.out.println("\nThe Given Input is: \n");
		System.out.println(sbin);
		
		String stin=sbin.toString();

		Scanner dict=new Scanner(System.in);
		File dic=new File("ARPAbet Dictionary.txt");
		dict=new Scanner(dic);

		System.out.println("\n\nThe Translation is:");
		System.out.println("(Wait for it...)\n");

		List<String> list=new ArrayList<String>();

		while(dict.hasNextLine())
		{
			String st=dict.nextLine();
			list.add(st);
		}

		for(int i=list.size()-1; i>=0; i--)
		{
			String line=list.get(i);
			String[] tokens=line.split("  ");
			String str=tokens[1].toString();

			if(stin.matches("(.*)P IH1 R IY0 AH0 D(.*)"));
				stin=stin.replace(" P IH1 R IY0 AH0 D", ".");
			if(stin.matches("(.*)"+str+"(.*)"));
				stin=stin.replace(str, tokens[0]);
		}

		System.out.print(stin);
		System.out.println("\n\nCopyright 2017 Parth Ketan Mehta. All Rights Reserved ;-)");
		System.out.println("\n\nThe Translation is also saved in a newly created file 'Output.txt'\n");
		PrintStream out = new PrintStream(new FileOutputStream("Output.txt"));
		System.setOut(out);
		System.out.println(stin+"\n\n");
		System.out.println("Copyright 2017 Parth Ketan Mehta. All Rights Reserved ;-)");
		
		dict.close();
		ip.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}