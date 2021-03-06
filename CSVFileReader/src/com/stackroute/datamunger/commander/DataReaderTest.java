package com.stackroute.datamunger.commander;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.datamunger.Header;

public class DataReaderTest 
{
	private static Header dataReader;
	@BeforeClass
	public static void init()
	{
		dataReader=new Header("emp");
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
