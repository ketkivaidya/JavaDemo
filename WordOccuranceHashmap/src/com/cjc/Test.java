package com.cjc;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		String s="Red color red blue color black color";
		s= s.toLowerCase();
		Map<String,Integer> hashmap=new HashMap<>();
		String words[]=s.split(" ");
		for(String word:words)
		{
			Integer integer=hashmap.get(word);
			if(integer==null)
		{
				
				hashmap.put(word, 1);
		}
			else
			{
				System.out.println(integer);
				hashmap.put(word, integer+1);
			}
		
		}
		System.out.println("Output of Project is as below");
		System.out.println(hashmap);
	}

}
