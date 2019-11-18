import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class DescuentoBlackFridayTest {

   @Test public void test_b1c1d2() 
   {
      double precio = -40.0;
      double descuento = -20.0;
      try {
	 DescuentoBlackFriday.PrecioFinal(precio, descuento);
      } catch (InvalidParameter e) {
        return;
      }
      fail ("InvalidParameter expected");
   }

   @Test public void test_b1c2d1() 
   {
      double precio = -40.0;
      double descuento = 120.0;
      try {
	 DescuentoBlackFriday.PrecioFinal(precio, descuento);
      } catch (InvalidParameter e) {
        return;
      }
      fail ("InvalidParameter expected");
   }

   @Test public void test_b1c2d2() 
   {
      double precio = -40.0;
      double descuento = 20.0;
      try {
	 DescuentoBlackFriday.PrecioFinal(precio, descuento);
      } catch (InvalidParameter e) {
        return;
      }
      fail ("InvalidParameter expected");
   }

   @Test public void test_b2c1d2() 
   {
      double precio = 40.0;
      double descuento = -20.0;
      try {
	assertTrue ("descuento negativo", (DescuentoBlackFriday.PrecioFinal(precio, descuento) - 40) < 0.5);
      } catch (InvalidParameter e) {
        fail ("40 expected");
      }
   }

   @Test public void test_b2c2d1() 
   {
      double precio = 40.0;
      double descuento = 120.0;
      try {
	assertTrue ("descuento mayor que 100", (DescuentoBlackFriday.PrecioFinal(precio, descuento) - 40) < 0.5);
      } catch (InvalidParameter e) {
        fail ("40 expected");
      }
   }

   @Test public void test_b2c2d2() 
   {
      double precio = 100.0;
      double descuento = 20.0;
      try {
	assertTrue ("descuento valido",(DescuentoBlackFriday.PrecioFinal(precio, descuento) - 80) < 0.5);
      } catch (InvalidParameter e) {
        fail ("80 expected");
      }
   }
}
