package com.processor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader 
{
	private String fileName;
	private BufferedReader bufferedReader;
	String[]  fileheaders;
	private String line;
	
	public DataReader(String fileName)
	{
		this.fileName=fileName;
	}
	
	public String[] getHeaders()
	{
		try
		{
			bufferedReader=new BufferedReader(new FileReader("d:\\"+ fileName +".csv"));
			line=bufferedReader.readLine();
			fileheaders=line.split(",");
		}
		catch(IOException e)
		{}
		return fileheaders;
	}
	
	public void getHeaderDataTypes()
	{}
	public void getData()
	{}

}
