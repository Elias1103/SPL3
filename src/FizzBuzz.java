
public class FizzBuzz {

	public static void main(String[] args) {
		for (int zahl = 1; zahl <= 100; zahl++) {
			FizzBuzz(zahl);
		}
	}

	public static void FizzBuzz(int zahl) {
		if (zahl % 3 == 0 && zahl % 5 == 0) {
			System.out.println(zahl + " = FizzBuzz");
		} else if (zahl % 5 == 0) {
			System.out.println(zahl + " = Buzz");
		} else if (zahl % 3 == 0) {
			System.out.println(zahl + " = Fizz");
		} else {
			System.out.println(zahl);
		}
	}
}
