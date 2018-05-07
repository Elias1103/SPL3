
public class FizzBuzz {

	public static void main(String[] args) {
		/*for (int zahl = 1; zahl <= 100; zahl++) {
			FizzerBuzzer(zahl);
		}*/
		for(int zahl = 0; zahl <= 100; zahl+=4) {
			FizzerBuzzer(zahl, false);
		}
	}

	public static void FizzerBuzzer(int zahl, boolean showFizzBuzz) {
		if (zahl % 4 == 0 && zahl % 7 == 0 && showFizzBuzz == true) {
			System.out.println(zahl + " = FizzerBuzzer");
		} else if (zahl % 4 == 0) {
			System.out.println(zahl + " = Fizzer");
		} else if (zahl % 7 == 0) {
			System.out.println(zahl + " = Buzzer");
		} else {
			System.out.println(zahl);
		}
	}
}

