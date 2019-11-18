import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class EmbotelladoraTest {

   @Test public void test_a1b1c1d1e1() 
   {
      int total = 25;
      int grandes = 7;
      int pequenas = 3;
      try {
	assertEquals ("Sobran pequenas y grandes",  0, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("0 expected");
      }
   }

   @Test public void test_a1b1c1d1e2() 
   {
      int total = 30;
      int grandes = 7;
      int pequenas = 4;
      try {
	assertEquals ("Sobran grandes",  0, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("0 expected");
      }
   }

   @Test public void test_a1b1c1d2e1() 
   {
      int total = 40;
      int grandes = 6;
      int pequenas = 14;
      try {
	assertEquals ("Sobran pequenas",  10, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("10 expected");
      }
   }

   @Test public void test_a1b1c1d2e2() 
   {
      int total = 32;
      int grandes = 6;
      int pequenas = 2;
      try {
	assertEquals ("No sobran",  2, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("2 expected");
      }
   }

   @Test public void test_a1b1c2d2e2() 
   {
      int total = 40;
      int grandes = 5;
      int pequenas = 10;
      try {
	 Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
      } catch (NoSolution e) {
        return;
      }
      fail ("NoSolution expected");
   }

   @Test public void test_a1b2c1d1e2() 
   {
      int total = 25;
      int grandes = 6;
      int pequenas = 0;
      try {
	assertEquals ("Sobran grandes no pequenas",  0, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("0 expected");
      }
   }

   @Test public void test_a1b2c1d2e2() 
   {
      int total = 30;
      int grandes = 6;
      int pequenas = 0;
      try {
	assertEquals ("No sobran grandes no pequenas",  0, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("0 expected");
      }
   }

   @Test public void test_a1b2c2d2e2() 
   {
      int total = 40;
      int grandes = 7;
      int pequenas = 0;
      try {
	 Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
      } catch (NoSolution e) {
        return;
      }
      fail ("NoSolution expected");
   }

   @Test public void test_a2b1c1d2e1() 
   {
      int total = 8;
      int grandes = 0;
      int pequenas = 10;
      try {
	assertEquals ("No grandes sobran pequenas",  8, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("8 expected");
      }
   }

   @Test public void test_a2b1c1d2e2() 
   {
      int total = 12;
      int grandes = 0;
      int pequenas = 12;
      try {
	assertEquals ("No grandes no sobran pequenas",  12, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("12 expected");
      }
   }

   @Test public void test_a2b1c2d2e2() 
   {
      int total = 20;
      int grandes = 0;
      int pequenas = 19;
      try {
	 Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
      } catch (NoSolution e) {
        return;
      }
      fail ("NoSolution expected");
   }

   @Test public void test_a2b2c2d2e2() 
   {
      int total = 40;
      int grandes = 0;
      int pequenas = 0;
      try {
	 Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
      } catch (NoSolution e) {
        return;
      }
      fail ("NoSolution expected");
   }
}


