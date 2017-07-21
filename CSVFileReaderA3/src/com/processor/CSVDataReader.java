package com.processor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class CSVDataReader extends DataReader 
{
	private String fileName;
	private BufferedReader bufferedReader=null;
	private String line="";
	private String fileHeaders;
	Map<Integer,String> headerDataTypes=new LinkedHashMap<>();
	String[] rowData;
	
	public CSVDataReader(String fileName)
	{
		this.fileName=fileName;
		try
		{
		bufferedReader=new BufferedReader(new FileReader("d:\\"+ this.fileName +".csv"));
		}
		catch(IOException e)
		{}
		
	}
	@Override
	public String getHeaders()
	{
		try
		{
			fileHeaders=bufferedReader.readLine();
			//fileHeaders=line.split(",");
		}
		catch(IOException e)
		{}
		return fileHeaders;
	}
	@Override
	public Map<Integer,String> getHeaderDataTypes()
	{
		int columnIndex = 0;
		try 
		{
			String firstLine=bufferedReader.readLine(); //skip the header
			while ((line = bufferedReader.readLine()) != null)
			{
				rowData = line.split(",");
				for (String elements : rowData) {
					try 
					{
						Double.parseDouble(elements);
						headerDataTypes.put(columnIndex, "Double");
					} 
					catch (Exception e) 
					{
						headerDataTypes.put(columnIndex, "String");
					}
					columnIndex++;
				}
				break;
			}
		} 
		catch (IOException e) 
		{}
		return headerDataTypes;
	}
	@Override
	public Map<Integer,ArrayList<String>> getData()
	{
		Map<Integer, ArrayList<String>> dataSet = new LinkedHashMap<>();
		int rowIndex = 0;
		try {
			
			String firstLine = bufferedReader.readLine(); //Skip the header
			while ((line = bufferedReader.readLine()) != null) {
				ArrayList<String> rowDataList = new ArrayList<String>();
				rowData = line.split(",");
				for (String data : rowData) {
					rowDataList.add(data);

				}
				dataSet.put(rowIndex, rowDataList);
				rowIndex++;
			}

		} catch (IOException e) 
		{}
		return dataSet;
	}
}
