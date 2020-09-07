package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave4
{
    public static void main(String[] args)
    {
        double inntekt = Double.parseDouble(showInputDialog("Hva er intekten? ")); 
        double skatt = 0; 

        if (inntekt >= 164101 && inntekt <= 230950) {
        	skatt = 0.0093; 
        }
        else if (inntekt >= 230951 && inntekt <= 580650){
        	skatt = 0.0241; 
        }
        else if (inntekt >= 580651 && inntekt <= 934050) {
        	skatt = 0.1152; 
        }
        else if (inntekt >= 934051) {
        	skatt = 0.1452; 
        }
        else skatt = 0; 
        
        double j = inntekt; 
        j *= skatt; 
        showMessageDialog(null, "Du må betale " + j + " i skatt " ); 
        
    }
}