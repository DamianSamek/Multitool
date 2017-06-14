import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MatematykaRownanieKwadratowe extends JFrame implements ActionListener 
{
	private double a, b, c, delta, x0, x1, x2, z = 0;
	private String x11, x22;
	JTextField tA, tB, tC;
	JLabel lA, lB, lC, lDelta, lx0, lx1, lx2;

	public MatematykaRownanieKwadratowe() 
	{
		setSize(600,600);
		setTitle("Równanie kwadratowe");
		setLayout(null);
		setVisible(true);

		tA = new JTextField();
		tA.setBounds(50, 50, 30, 20);
		add(tA);
		tA.addActionListener(this);

		lA = new JLabel("x^2\t +");
		lA.setBounds(80, 50, 60, 20);
		add(lA);

		tB = new JTextField();
		tB.setBounds(140, 50, 30, 20);
		add(tB);
		tB.addActionListener(this);

		lB = new JLabel("x\t +");
		lB.setBounds(170, 50, 60, 20);
		add(lB);

		tC = new JTextField();
		tC.setBounds(230, 50, 30, 20);
		add(tC);
		tC.addActionListener(this);

		lC = new JLabel(" = 0");
		lC.setBounds(260, 50, 30, 20);
		add(lC);

		lDelta = new JLabel("Delta= ");
		lDelta.setBounds(50, 100, 200, 20);
		add(lDelta);

		lx0 = new JLabel("");
		lx0.setBounds(50, 140, 60, 20);
		add(lx0);

		lx1 = new JLabel("");
		lx1.setBounds(50, 160, 400, 20);
		add(lx1);

		lx2 = new JLabel("");
		lx2.setBounds(50, 180, 400, 20);
		add(lx2);

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object zrodlo = e.getSource();
		a = Integer.parseInt(tA.getText());
		b = Integer.parseInt(tB.getText());
		c = Integer.parseInt(tC.getText());

		delta = (b * b) - 4 * (a * c);
		lDelta.setText("Delta= " + String.valueOf(delta));

		if (delta > 0) 
		{
			lx0.setText("");
			x1 = (-1 * b + Math.sqrt(delta)) / 2 * a;
			x2 = (-1 * b - Math.sqrt(delta)) / 2 * a;
			lx1.setText("x1 = " + String.valueOf(x1));
			lx2.setText("x2 = " + String.valueOf(x2));
		} 
		
		else if (delta == 0) 
		{
			x0 = (-1 * b) / (2 * a);
			lx0.setText("x0 = " + String.valueOf(x0));
		} 
		
		else if (delta < 0)
		{
			lx0.setText("");
			x11 = ((-1 * b) / (2 * a)) + "+" + (Math.sqrt(delta * -1) / (2 * a)) + "i";
			x22 = ((-1 * b) / (2 * a)) + "-" + (Math.sqrt(delta * -1) / (2 * a)) + "i";
			lx1.setText("x1 = " + x11);
			lx2.setText("x2 = " + x22);
		}

	}
}
