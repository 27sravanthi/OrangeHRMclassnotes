package August_13_DataProvider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class TEst1 {
	
	
	String str="Sudhakar";
	
  @Test
  public void Test5() {
	  
	  Pattern p = Pattern.compile("[^A-Za-z0-9]");
	  Matcher m = p.matcher(str);
	    
	     boolean b = m.find(); //True or False
	     if (b)
	        System.out.println("There is a special character in my string ");
	     else
	         System.out.println("There is no special char.");
	  
	  
  }
}
