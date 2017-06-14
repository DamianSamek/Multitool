import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Inne extends JFrame implements ActionListener
{
JButton bKonwerterTemperatur;
	public Inne()
	{
		setSize(600, 600);
		setTitle("Program");
		setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
		bKonwerterTemperatur = new JButton("Konwerter temperatur");
		bKonwerterTemperatur.setBounds(50,50,200,30);
		add(bKonwerterTemperatur);
		bKonwerterTemperatur.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object zrodlo = e.getSource();
		if (zrodlo==bKonwerterTemperatur)
		{
			CelsiusToFahrenheit celsius = new CelsiusToFahrenheit();
			celsius.setVisible(true);
			dispose();
		}
		
	}

}
