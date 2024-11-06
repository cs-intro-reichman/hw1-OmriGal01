// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)((Math.random()) * lim);
		int b = (int)((Math.random()) * lim);
		int c = (int)((Math.random()) * lim);
		System.out.println(a + " " + b + " " + c);
		int small = Math.min(a, Math.min(b, c));
		int big = Math.max(a, Math.max(b, c));
		int middle = Math.max(Math.max(Math.min(a, b), Math.min(a, c)), Math.min(b, c));
		System.out.println(small + " " + middle + " " + big);
	}
}
