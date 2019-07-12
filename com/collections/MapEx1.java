package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEx1 
{  
	public static void main(String[] args) {  
		
	    Map map=new LinkedHashMap();
	    
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
        map.put(2,"sss");
        map.put(3,"sss");
        map.put(4,"sss");
        
	    //Traversing Map  
	    Set set=map.entrySet();//Converting to Set so that we can traverse  
	    
	    Iterator itr=set.iterator();  
	    
	    while(itr.hasNext())
	    {  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
	}  
	}  