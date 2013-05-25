package com.zymr.server.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class UserValidation implements ValidationService
{
	String result ="invalid";
	
	@Override
	public String checkUser(Map<String,String> usermap)                                                                     
	{
		Set<Entry<String,String>> userset=usermap.entrySet();
		Iterator<Entry<String, String>> it=userset.iterator();
		
		Entry<String, String> userEntry=it.next();
				
	
		if((userEntry.getKey().equalsIgnoreCase("first"))&&(userEntry.getValue().equals("first")))
		{
			System.out.println("user "+userEntry.getKey()+"is valid");
			result ="valid";
		}
		else
		{
			System.out.println(userEntry.getKey()+"is invalid");
		}
		return result;
	}
	
}
