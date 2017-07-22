package com.stackroute.datamunger.commander;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.datamunger.CSVDataReader;
import com.stackroute.datamunger.DataReader;

public class CSVDataReaderTest 
{
	private static DataReader dataReader;
	private static Map<Integer,String> headerDataTypes;
	private static Map<Integer,ArrayList<String>> dataSet;
	@Before
	public void init()
	{
		dataReader=new CSVDataReader("emp");
		headerDataTypes=new LinkedHashMap<>();
		dataSet=new LinkedHashMap<Integer,ArrayList<String>>();
	}
	@Test
	public void getHeadersTest()
	{
		String fileHeaders=dataReader.getHeaders();
		assertNotNull(fileHeaders);
		System.out.println("=========File Headers=============");
		System.out.println(fileHeaders);
		/*for(String column : fileHeaders)
		{
			System.out.print(column.trim()+" ");
		}*/
	}
	
	@Test
	public void getHeaderDataTypesTest()
	{
		headerDataTypes=dataReader.getHeaderDataTypes();
		assertNotNull(headerDataTypes);
		System.out.println("========Header Data Types===========");
		for(Map.Entry<Integer, String> entry:headerDataTypes.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	@Test
	public void getDataTest()
	{
		dataSet=dataReader.getData();
		assertNotNull(dataSet);
		System.out.println("==========Table Data================");
		for(Map.Entry<Integer, ArrayList<String>> entry:dataSet.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	@After
	public void destroy()
	{
		dataReader=null;
		headerDataTypes=null;
		dataSet=null;
	}

}
