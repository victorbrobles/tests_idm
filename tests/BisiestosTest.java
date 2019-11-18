import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BisiestosTest
{

   @Test public void anyo_invalido() 
   {
      int anyo = -132;
      try {
	Bisiestos.esBisiesto(anyo);
      } catch (InvalidParameter e) {
        return;
      }
      fail ("InvalidParameter expected");
   }

   @Test public void multiplo_4_100_400() 
   {
      int anyo = 1200;
      try {
      	assertEquals("Multiplo de 4,100 y 400", true, Bisiestos.esBisiesto(anyo));
      } catch (InvalidParameter e) {
	fail ("True expected");
      }
   }

   @Test public void multiplo_4() 
   {
      int anyo = 120;
      try {
      	assertEquals("Solo multiplo de 4", true, Bisiestos.esBisiesto(anyo));
      } catch (InvalidParameter e) {
	fail ("True expected");
      }
   }

  @Test public void multiplo_4_100() 
   {
      int anyo = 300;
      try {
      	assertEquals("MUltiplo de 4 y 100", false, Bisiestos.esBisiesto(anyo));
      } catch (InvalidParameter e) {
	fail ("False expected");
      }
   }


  @Test public void no_multiplo() 
   {
      int anyo = 3423;
      try {
      	assertEquals("No multiplo", false, Bisiestos.esBisiesto(anyo));
      } catch (InvalidParameter e) {
	fail ("False expected");
      }
   }
}

