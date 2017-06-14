import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CelsiusToFahrenheit extends JFrame implements ActionListener
{
	private JLabel lStopnieCelsjusza, lStopnieFahrenheita;
	private JTextField tStopnieCelsjusza, tStopnieFahrenheita;
	private double tempCelsjusza, tempFahrenheita, zz;
	private JCheckBox chWielkie;

	public CelsiusToFahrenheit() 
	{
		setSize(600, 600);
		setTitle("Celsius to Fahrenheit");
		setLayout(null);

		lStopnieCelsjusza = new JLabel("Stopnie Celsjusza: ");
		lStopnieCelsjusza.setBounds(100, 50, 150, 20);
		add(lStopnieCelsjusza);

		lStopnieFahrenheita = new JLabel("Stopnie Fahrenheita: ");
		lStopnieFahrenheita.setBounds(100, 100, 150, 20);
		add(lStopnieFahrenheita);

		tStopnieCelsjusza = new JTextField("");
		tStopnieCelsjusza.setBounds(250, 50, 150, 20);
		add(tStopnieCelsjusza);
		tStopnieCelsjusza.addActionListener(this);

		tStopnieFahrenheita = new JTextField("");
		tStopnieFahrenheita.setBounds(250, 100, 150, 20);
		add(tStopnieFahrenheita);
		tStopnieFahrenheita.addActionListener(this);

		chWielkie = new JCheckBox("Wielkie litery");
		chWielkie.setBounds(200, 120, 150, 20);
		add(chWielkie);
		chWielkie.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object zrodlo = e.getSource();

		if (zrodlo == tStopnieCelsjusza)
		{
			tempCelsjusza = Double.parseDouble(tStopnieCelsjusza.getText());
			tempFahrenheita = 32.0 + (9.0 / 5.0) * tempCelsjusza;
			tStopnieFahrenheita.setText(String.valueOf(tempFahrenheita));

		}

		else if (zrodlo == tStopnieFahrenheita) 
		{
			tempFahrenheita = Double.parseDouble(tStopnieFahrenheita.getText());
			tempCelsjusza = -1 * (32.0 - tempFahrenheita) / (9.0 / 5.0);
			tStopnieCelsjusza.setText(String.valueOf(tempCelsjusza));
		}

		else if (zrodlo == chWielkie)
		{
			if (chWielkie.isSelected() == true)
			{
				tStopnieFahrenheita.setFont(new Font("Sansserif", Font.BOLD, 18));
				tStopnieCelsjusza.setFont(new Font("Sansserif", Font.BOLD, 18));
			}
			
			else 
			{
				tStopnieFahrenheita.setFont(new Font("Sansserif", Font.PLAIN, 12));
				tStopnieCelsjusza.setFont(new Font("Sansserif", Font.PLAIN, 12));
			}

		}

	}
}
