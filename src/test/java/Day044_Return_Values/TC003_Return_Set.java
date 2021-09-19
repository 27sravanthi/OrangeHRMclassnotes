package Day044_Return_Values;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class TC003_Return_Set {
	
	
	@Test
	public void Test1()throws Exception
	{
		
		
		
	    Set<String> p1 = new HashSet<String>();
	    
	    p1=Page1();
	    
	 
	    
	    System.out.print(p1);
	    
	  
	    
	}
	
	

	
	
	
	public  void page2(String string1, String string2, String string3) {
		
	
		   System.out.println(" Element data 0  :  " + string1);
		   System.out.println(" Element data 1  :  " + string2);
		   System.out.println(" Element data 2  :  " + string3);
	}






	public  void page2(List<String> page_li) {
		// TODO Auto-generated method stub
		
		System.out.println(page_li);
		
		for(String str5:page_li){  
			 System.out.println("The value is " +str5);  
			}  
		
		
		   System.out.println(" Element data 0  :  " + page_li.get(0));
		   System.out.println(" Element data 1  :  " + page_li.get(1));
		   System.out.println(" Element data 2  :  " + page_li.get(2));
		   

	}






	public Set<String> Page1()    {
		
		 Set<String> Page_list1 = new HashSet<String>();
	    
	    Page_list1.add("Order");
	    Page_list1.add("11");
	    Page_list1.add("Indian777");
	    Page_list1.add("Indian777");
	    
	    return Page_list1;
	   
	   }
	
	
		public void printList(List<String> list){
			    for(String elem : list){
			        System.out.println(elem+"  ");
			    }
			}
		
		
		
		public  void printList1(List<String> list)
		{
		    for (int i=0; i<list.size(); i++)
		        System.out.println(list.get(i));
		}
		
		
		
		
		
		

}
