
package rechner;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import rechner.event;

/**
 * @author junio
 *
 */
public class Gui {

	JFrame jf= new JFrame();
	JPanel panel= new JPanel();
	FlowLayout layout=null;
	static JTextField fieldNummer1=null;
	static JComboBox listOperator=null;
	static String[] operator= new String[] {"+","/","*","-"};
	static JTextField fieldNummer2=null;
	JButton rechnen=null;
	static JLabel labelResult=null;
	
	public Gui() {
		//window
				jf.setTitle("Rechner");
				jf.setSize(350, 250);
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf.setResizable(false);
				jf.setBackground(Color.darkGray);
				jf.setLocationRelativeTo(null);
				
				
				//layout
				layout= new FlowLayout();
				layout.setAlignment(FlowLayout.LEFT);
				panel.setLayout(layout);
				
				//label
				fieldNummer1= new JTextField();
				fieldNummer1.setPreferredSize(new Dimension(100,40));
				fieldNummer1.setVisible(true);
				panel.add(fieldNummer1);
				
				listOperator= new JComboBox(operator);
				listOperator.setPreferredSize(new Dimension(50,40));
				panel.add(listOperator);
				
				fieldNummer2= new JTextField();
				fieldNummer2.setPreferredSize(new Dimension(100,40));
				fieldNummer2.setVisible(true);
				panel.add(fieldNummer2);
				
				//button
				rechnen= new JButton("rechnen");
				rechnen.setPreferredSize(new Dimension(250,50));
				rechnen.addActionListener(new event());
				rechnen.setBackground(Color.red);
				rechnen.setVisible(true);
				panel.add(rechnen);
				
				labelResult=new JLabel("Ergebnis");
				labelResult.setPreferredSize(new Dimension(200,50));
				labelResult.setVisible(true);
				panel.add(labelResult);
				
				jf.add(panel);
				jf.setVisible(true);
				
			}
			
	}

