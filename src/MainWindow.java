import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame implements ActionListener
{
	JButton bInne, bWyjscie, bMatematyka;
	
	public MainWindow()
	{
	setSize(600, 600);
	setTitle("Program");
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

	bMatematyka = new JButton("Matematyka");
	bMatematyka.setBounds(50,50,200,30);
	add(bMatematyka);
	bMatematyka.addActionListener(this);
	
	
	bInne = new JButton("Inne");
	bInne.setBounds(50, 100, 200, 30);
	add(bInne);
	bInne.addActionListener(this);

	

	bWyjscie = new JButton("Wyjœcie");
	bWyjscie.setBounds(50, 500, 200, 30);
	add(bWyjscie);
	bWyjscie.addActionListener(this);
}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object zrodlo = e.getSource();
		
		if (zrodlo == bWyjscie) 
		{
			dispose();
		} 
		
		else if (zrodlo == bInne)
		{
			Inne inne = new Inne();
			inne.setVisible(true);
		} 
		
		else if (zrodlo == bMatematyka)
		{

			Matematyka matma = new Matematyka();
			matma.setVisible(true);
		}
	}
}
