import java.util.*;

public class DescuentoBlackFriday {

	public static double PrecioFinal (double PrecioOriginal, double porcentajeDescuento) throws InvalidParameter {

	if (PrecioOriginal < 0.0) {
		throw new InvalidParameter();
	}
	
	if (porcentajeDescuento > 100.0 || porcentajeDescuento < 0.0) {
		return PrecioOriginal;
	} else {
		return ((PrecioOriginal * porcentajeDescuento) / 100);
	}
	}
}

	
	

	
		
