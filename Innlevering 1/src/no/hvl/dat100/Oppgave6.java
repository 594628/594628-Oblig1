package no.hvl.dat100;

import static javax.swing.JOptionPane.*; 

public class Oppgave6 {
	
	public static int fakultet(int a) {
        int b = a - 1;
        while (b > 0){
            a = a * b;
            b = b - 1;
        }
		return a; 
	}

	public static void main(String[] args) {
		
		int n = Integer.parseInt(showInputDialog("Tast inn ett heltall ")); 
		showMessageDialog(null,"fakultet av " +n + " er " + fakultet(n)); 

	}

}
