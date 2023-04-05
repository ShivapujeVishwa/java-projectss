package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {
public static void main(String[] args) {
	Map<String, Double> map=new LinkedHashMap<>();
	map.put("Tom", 3.0);
	map.put("jerry", 10.0);
	map.put("Vishwa", 20.0);
	
Set<String>	keys=map.keySet();

for(String name:keys) {
	System.out.println("Salary of "+name+"  is:"+map.get(name)+"LPA");
}
}
}
