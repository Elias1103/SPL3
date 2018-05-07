
public class TemperaturMittelwert {

	public static void main(String[] args) {
		int[] temp = new int[1000];
		// 0 bis 40 Grad
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int) (Math.random() * 41);
			System.out.println(temp[i]);
		}
		
		//# Temperaturwerte < 10 Grad
		int unter10Grad = 0;
		int zwischen10und20Grad = 0;
		int zwischen20und30Grad = 0;
		int zwischen30und40Grad = 0;
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] < 10) {
				unter10Grad++;
			}
			else if(temp[i] >= 10 && temp[i] < 20) {
				zwischen10und20Grad++;
			}
			else if(temp[i] >= 20 && temp[i] < 30) {
				zwischen20und30Grad++;
			}
			else if(temp[i] >= 30 && temp[i] <= 40) {
				zwischen30und40Grad++;
			}
		
			
		}
		System.out.println(unter10Grad + " Werte < 10 Grad");
		System.out.println(zwischen10und20Grad + " Werte zwischen 10 und 20 Grad");
		System.out.println(zwischen20und30Grad + " Werte zwischen 20 und 30 Grad");
		System.out.println(zwischen30und40Grad + " Werte zwischen 30 und 40 Grad");
	}

}
