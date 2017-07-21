package com.processor;

import java.util.ArrayList;
import java.util.Map;

public abstract class DataReader 
{
	public abstract String getHeaders();
	
	public abstract Map<Integer,String> getHeaderDataTypes();
	
	public abstract Map<Integer,ArrayList<String>> getData();

}
