package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {

	public static void main(String[] args) {
		
		int poeng = Integer.parseInt(showInputDialog("Hvilken poengsum fikk du på prøven? ")); 
		String karakter = null; 
		if (poeng < 0 || poeng > 100) {
			showMessageDialog(null,"Du skrev ikke inn gyldig poengsum"); 
			
		}
		else if (poeng >= 40 && poeng <= 49){
			karakter = "E"; 
		}
		else if (poeng >= 40 && poeng <= 49){
			karakter = "E"; 
		}
		else if (poeng >= 50 && poeng <= 59){
			karakter = "D"; 
		}
		else if (poeng >= 60 && poeng <= 79){
			karakter = "C"; 
		}
		else if (poeng >= 80 && poeng <= 89){
			karakter = "B"; 
		}
		else if (poeng >= 90 && poeng <= 100){
			karakter = "A"; 

		}else karakter = "F";  
		
		if (poeng >= 0 && poeng <= 100) {
			String ut = "Du fikk " + karakter + " på prøven! :)"; 
			showMessageDialog(null,ut);
			
		}else showMessageDialog(null,"Venligst hold deg innenfor 0 - 100"); 

		

	}

}
