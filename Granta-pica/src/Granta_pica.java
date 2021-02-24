import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Granta_pica {
	static String failaNosaukums1;
	
	public static void klientaInfo(){
		try{
			FileWriter ryt = new FileWriter("pasutijums");
			BufferedWriter out=new BufferedWriter(ryt);
			JTextField vards = new JTextField();
			JTextField adrese = new JTextField();
			JTextField telefons = new JTextField();
			Object[] message = {    "Klienta vārds:", vards,"Klienta adrese:", adrese,"Klienta numurs:", telefons};
			int answer = JOptionPane.showConfirmDialog(    null, message, "Ieraksti informāciju: ", JOptionPane.OK_CANCEL_OPTION);
			if (answer == JOptionPane.OK_OPTION){    String klientaVards = vards.getText();
			String KlientaAdrese = adrese.getText();
			String TelNumurs = telefons.getText();
			out.write("Klienta vārds: " +vards.getText()+"\n");
			out.write("Klienta adrese: " +adrese.getText()+"\n");
			out.write("Klienta numurs: " +telefons.getText()+"\n");
			out.close();
			JOptionPane.showMessageDialog(null, "Informācija ir ierakstīta!");
			
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Kļūme ierakstot failā!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void apskatit (){
		
		String teksts;
		try{
			failaNosaukums1 = JOptionPane.showInputDialog("pasūtījums: ");
			FileReader fr = new FileReader(failaNosaukums1);
			BufferedReader lasa = new BufferedReader(fr);
			while((teksts=lasa.readLine())!=null){
				System.out.println(teksts);
			}
			lasa.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Kļūme ierakstot failā!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void main(String[] args) {
		String picasIzvele;
		
		do {
			JOptionPane.showMessageDialog(null, "Ēdienu karte");
			picasIzvele = JOptionPane.showInputDialog("1-Klienta info | 2-apskatīt klienta info | 3-pasūtīt| x-close");
			picasIzvele = picasIzvele.toLowerCase();	
			switch(picasIzvele) {
			case "1":
				klientaInfo();
			break;
			case "2":
				apskatit();
			break;
			case "3":
				String izvele, picasIzmers;
				int klientaIzvele=0;
				double rekins;
				picasIzmers =  JOptionPane.showInputDialog(null, "Picas izmers: \n" + "1 - Lielā \n2 - Videjā" + "\n3 - mazā");
				if(klientaIzvele ==1) {
					rekins  =+ 9.99;
				}else if(klientaIzvele == 2){
					rekins =+ 5.99;
				}else if(klientaIzvele == 3){
					rekins =+ 3.99;
					
				}
				izvele =  JOptionPane.showInputDialog(null, " Izvēlies savu picu: \n" + "1 - Kalifornijas pica \n2 - Siera pica" + "\n3 - Pikantā pica\n4 - Lauku pica");
				klientaIzvele = Integer.parseInt(izvele);
				if(klientaIzvele == 1 | klientaIzvele == 2);
				rekins =+ 0;
				
				izvele = JOptionPane.showInputDialog(null,"Vai vēleis dzērienu?\n1 - Jā\n2- Nē");
				klientaIzvele = Integer.parseInt(izvele);
				 if(klientaIzvele == 1  )
					 rekins += 0.90;
				 
				izvele = JOptionPane.showInputDialog(null,"Vai vēleis piedavas?\n1 - Jā\n2- Nē");
					klientaIzvele = Integer.parseInt(izvele);
					 if(klientaIzvele == 1  )
						 rekins += 1.20;
				 
				izvele = JOptionPane.showInputDialog(null,"Vai pasūtījumu vajadzēs piegādāt?\n1 - Jā\n2- Nē");
					klientaIzvele = Integer.parseInt(izvele);
					 if(klientaIzvele == 1  )
						 rekins += 3.00;
				 
				 JOptionPane.showMessageDialog(null,"Rēķins ir " + rekins );
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
