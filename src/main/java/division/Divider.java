package division;

public class Divider {

	public double divide(int a, int b) {
		if (b != 0) {
			return (double) a / b;
		} else {
			return Double.MAX_VALUE;
		}
	}

}
