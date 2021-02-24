import javax.swing.JOptionPane;

public class Granta_pica {

	public static void main(String[] args) {
		String picasIzvele;
		
		do {
			JOptionPane.showMessageDialog(null, "Ēdienu karte");
			picasIzvele = JOptionPane.showInputDialog("1-Klienta info | 2-apskatīt klienta info | 3-pasūtīt| x-close");
			picasIzvele = picasIzvele.toLowerCase();	
			switch(picasIzvele) {
			case "1":
			break;
			case "2":
			break;
			case "3":
				break;
			case "x":
				JOptionPane.showMessageDialog(null, "Programma apturēta!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				break;
				
			default: 
		 		JOptionPane.showMessageDialog(null, "Tāda izvēle nepastāv!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
		 	break;
			}
		}while(!picasIzvele.equals("x"));

	}

}
