import javax.swing.JOptionPane;

public class Granta_pica {

	public static void main(String[] args) {
		String picasIzvele;
		
		do {
			JOptionPane.showMessageDialog(null, "Ēdienu karte");
			picasIzvele = JOptionPane.showInputDialog("1-Klienta info | 2-apskatīt klienta info | 3-pasūtīt| x-close");
			picasIzvele = picasIzvele.toLowerCase();		
		}while(!picasIzvele.equals("x"));

	}

}
