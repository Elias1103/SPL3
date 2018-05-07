
public class Unterprogramme {

	public static void main(String[] args) {
		String text = "Heute ist ein schöner Tag.";

		char[] z = text.toCharArray();
		zeichenZaehlen(z, 'e');
		zeichenZaehlen(z, 'i');
		zeichenZaehlen(z, 'n');
	}

	public static void zeichenZaehlen(char[] z, char x) {
		// # e´s
		int counter = 0;
		for (int i = 0; i < z.length; i++) {
			if (z[i] == x) {
				counter++;
			}
			
		}
		System.out.println("Anzahl der " + x + "'s im Text: " + counter);
	}
}
