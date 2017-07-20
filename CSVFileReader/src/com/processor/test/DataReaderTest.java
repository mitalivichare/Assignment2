package com.processor.test;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.processor.DataReader;

public class DataReaderTest 
{
	private static DataReader dataReader;
	@BeforeClass
	public static void init()
	{
		dataReader=new DataReader("emp");
	}
	@Test
	public void getHeadersTest()
	{
		String[] fileHeaders=dataReader.getHeaders();
		assertNotNull(fileHeaders);
		for(String column : fileHeaders)
		{
			System.out.print(column+",");
		}
	}

}
