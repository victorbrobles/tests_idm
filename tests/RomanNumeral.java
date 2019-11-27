import java.security.InvalidParameterException;
import java.util.Scanner;
import java.util.*;

public class RomanNumeral {
	// Parametro: s es un numero romano
	// Devuelve : el numero s en base 10
	// Eleva la excepcíon InvalidParameter si s no es un numero romano
	
	public static int convierte(String s) throws InvalidParameter{
		char Rom[]= {' ','I','V','X','L','C','D','M'}; 
		int valor[] = {0,1,5,10,50,100,500,1000};
		int ant = 0;
		int suma = 0;
		char letra = ' ';
		for(int i = 0; i < s.length(); i++){
		        letra = s.charAt(i);
		        for(int j = 0; j < Rom.length; j++){
		            if(letra == ' ' || letra == 'I' || letra == 'V' || 					letra == 'X' || letra == 'L' || letra == 'C' || 				letra == 'D' || letra == 'M'){               
		                        suma = suma + valor [j];
		                    if( ant < valor[j]){
		                    	suma = suma - ant*2 ;
		                        ant = valor[j];
		                    }else {
					ant = valor[j];
		                    }
		            } else {
		            	throw new InvalidParameter();
		            }
		        }
		}
		return suma;    
		}
	
}

