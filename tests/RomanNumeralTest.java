import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.security.InvalidParameterException;

import org.junit.Test;


public class RomanNumeralTest {
	
	@Test public void test1() 
	   {
	      String s = "V";
	      assertEquals("secondPosition", 5, RomanNumeral.convierte(s));
	   }
	
	 @Test public void test2() 
	   {
	     String s = "-1";
	      try {
	    	  RomanNumeral.convierte(s);
	      } catch (InvalidParameterException e) {
	    	  fail ("NoSolution expected");
	      }
	      
	   }
	 @Test public void test3() 
	   {
	     String s = "J";
	      try {
	    	  RomanNumeral.convierte(s);
	      } catch (InvalidParameterException e) {
	    	  fail("InvalidParameterException expected");
	      }
	      
	   }
	
	 @Test public void test4() 
	   {
	     String s = "4";
	      try {
	    	  RomanNumeral.convierte(s);
	      } catch (InvalidParameterException e) {
	    	  fail ("NoSolution expected");
	      }
	 
	   }
}
