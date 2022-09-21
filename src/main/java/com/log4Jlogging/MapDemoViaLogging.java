package com.log4Jlogging;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import java.util.SortedMap;
import java.util.TreeMap;

public class MapDemoViaLogging {
	

	final static Logger logger = Logger.getLogger(MapDemoViaLogging.class);
	//final static org.slf4j.Logger log = LoggerFactory.getLogger(Log4JLoggingExample.class);

	public static void main(String[] args) {
	
	//TreeMap Example 
		Map<String, String> map = new TreeMap<String, String>();
		 map.put("name","TreeMap");
		 map.put("Details","Tree Map Example");
		 map.put("Detail","Tree Mapjhjhj Example");
		 map.put("AA","Tree Mapjhjhj Example");
		 logger.info(map.get("name")); //TreeMap
		 logger.info(map); //{Details=Tree Map Example, name=TreeMap}
		 logger.info(map.keySet()); //[Details, name]
		 logger.info(map.values()); //[Tree Map Example, TreeMap]
		 
//-------------------------------------------------------------------------------------	 
	//LinkedHashMap Example by instantiating object of LinkedHashMap by LinkedHashMap map class.
		 LinkedHashMap<String, String> lhmap = new LinkedHashMap<String, String>(); 
		 lhmap.put("name","LinkedHashMap");
		 lhmap.put("Details", "LinkedHashMap Example");
		 lhmap.put(null, null);
		 lhmap.put("Null 1", null);
		 logger.info("lhmap:"+lhmap);

		 
	//LinkedHashMap Example by instantiating object of Map interface by LinkedHashMap map class.
	// This is better way to instantiate the object, since if you object of MAP interface is 
	//declared then we can instantiate by any decendent class(TreeMap, HashMap, LinkedHashMap )
		 map = new LinkedHashMap<String, String>();
		 
		 map.put("name","LinkedHashMap");
		 map.put("Details", "LinkedHashMap Example through MAP object");
		 logger.info(map.get("name"));
		 logger.info(map);
		 logger.info(map.keySet());
		 logger.info(map.values());
	
//-----------------------------------------------------------------------
	//HashMap Example .
		 HashMap<String, String> hmap = new HashMap<String, String>();
		 hmap.put("name","HashMap---------------------kriississs----------------------------------");
		 hmap.put("Details", "HashMap Example");
		 hmap.put(null, null);
		 hmap.put("Null 1", null);
		 logger.info("hmap: "+hmap);
		 
	//HashMap Example by instantiating object of Map interface by HashMap map class.
		 map = new HashMap<String, String>();
		 map.put("name","HashMap");
		 map.put("Details", "HashMap Example");
		 logger.info(map.get("name"));
		 logger.info(map);
		 logger.info(map.keySet());
		 logger.info(map.values());
 //-------------------------------------------------------------------
	//SortedMap Example .
		 
		 SortedMap<String, String> smap = new TreeMap<String, String>();
		 smap.put("name","TreeMap");
		 smap.put("Details", "TreeMap Example");
		 logger.info(smap.get("name"));
		 logger.info(smap);
		 logger.info(smap.keySet());
		 logger.info(smap.values()); 
	
//-------------------------------------------------------------------
	//Hashtable Example .		 
		 
		 Hashtable<String, String> ht = new Hashtable<String, String>();

		 ht.put("name", "HashTable");
		 ht.put("Details", "HashTable Example");
		 //ht.put(null, null);
		 //ht.put(null, "ttrtr");
		 logger.info(ht);
		 logger.info(ht.get("name"));
		 
		 for(Map.Entry<String, String>  value : ht.entrySet()) {
			 logger.info(value.getValue());
			 
		 }
		 
	}
}