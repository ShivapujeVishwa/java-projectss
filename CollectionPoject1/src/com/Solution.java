package com;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		
		Map<Integer, String> map=new LinkedHashMap<>();
		map.put(10, "Viahwa");
		map.put(20, "Tom");
		map.put(30, "Jerry");
		
		Set<Integer> keys=map.keySet();
		
		for(Integer key:keys) {
			System.out.println(key+" name is:"+map.get(key));
		}
	}

} 
