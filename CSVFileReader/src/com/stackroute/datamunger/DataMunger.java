package com.stackroute.datamunger;

import java.util.Scanner;

public class DataMunger 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter table name: ");
		String fileName=scanner.nextLine();
		Header dataReader=new Header(fileName);
		String[] fileHeaders=dataReader.getHeaders();
		System.out.println();
		for(String column : fileHeaders)
		{
			System.out.print(column+" ");
		}
	}

}
