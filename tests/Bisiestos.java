public class Bisiestos {

	private static final InvalidParameter Miexcepcion = null;

	public  static boolean esBisiesto(int anyo) throws InvalidParameter 
	{
		if (anyo>0) 
		{
			if (anyo%4 == 0) 
			{
				if (anyo%100 == 0)
				{
					if(anyo%400 == 0)
					{
						return true;
					} else 
					{
						return false;
					}
				} else 
				{
					return true;
				}
			}
		} else
		{
			throw Miexcepcion;
		}
		
		return false;
	}
}
