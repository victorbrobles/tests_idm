import java.util.*;

public class Embotelladora {

	public static int calculaBotellasPequenas (int pequenas, int grandes, int total) throws NoSolution {

		int count = 0;
		int restante = 0;
		if (total == 0) {
			return count;
		}
		if ((grandes * 5) >= total) {
			return count;
		}
		restante = total - (5 * grandes);
		if ((restante - pequenas) > 0) {
			throw new NoSolution();
		} else {
			return restante;
		}
	}
}
			
