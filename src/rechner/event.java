package rechner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import rechner.Gui;

public class event implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//Nimm Zahl1
		 String Nummer1string=Gui.fieldNummer1.getText();
		 double Nummer1=Double.parseDouble(Nummer1string);
		 //Nimm Zahl2
		 String Nummer2string=Gui.fieldNummer2.getText();
		 double Nummer2=Double.parseDouble(Nummer2string);
		 //Summe
		 double ergebnis=0;
		 if(Gui.listOperator.getSelectedItem().equals("+")) {
			 ergebnis=Nummer1+Nummer2;
		 }
		 else if(Gui.listOperator.getSelectedItem().equals("-")) {
			 ergebnis=Nummer1-Nummer2;
		 }
		 else if(Gui.listOperator.getSelectedItem().equals("/")) {
			 ergebnis=Nummer1/Nummer2;
		 }
		 else if(Gui.listOperator.getSelectedItem().equals("*")) {
			 ergebnis=Nummer1*Nummer2;
		 }

		 Gui.labelResult.setText("Ergebnis= "+ergebnis);
		
		
	}

}
