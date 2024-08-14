package com.cjc;

import java.util.HashMap;
import java.util.Map;

public class output {
	public static void main(String[] args) {
		
		String s="ketki vaidya ketki manohar";
		String words[]=s.split(" ");
		Map<String,Integer> hashmap=new HashMap<String,Integer>();
		for(String word:words)
		{
			Integer integer=hashmap.get(word);
			if(integer==null)
			{
				hashmap.put(word, 1);
				
			}
			else
			{
				hashmap.put(word, integer+1);
			}
		}
		System.out.println(hashmap);
	
	}
	
}



