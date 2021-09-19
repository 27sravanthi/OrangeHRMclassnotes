package Day044_Return_Values;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class TC005_Return_Multiple_Values_HashMap {
	
	
	@Test
	public void Test1()throws Exception
	{
	    
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1=getHashMap();
		System.out.println(map1);
		
		
		
	}
	
	public Map<String, Integer> getHashMap() throws Exception
	{
		
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	
    map.put("vishal", 10);
    map.put("sachin", 30);
    map.put("vaibhav", 20);


    System.out.println("Size of map is:- "+ map.size());

    // Printing elements in object of Map
    
    
    return map;

	}

}
