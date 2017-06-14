import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Matematyka extends JFrame implements ActionListener {

	JButton bRownanieKwadratowe;

	public Matematyka() {
		setSize(600, 600);
		setTitle("Program");
		setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		bRownanieKwadratowe = new JButton("Równanie kwadratowe");
		bRownanieKwadratowe.setBounds(50, 100, 200, 30);
		add(bRownanieKwadratowe);
		bRownanieKwadratowe.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object zrodlo = e.getSource();

		if (zrodlo == bRownanieKwadratowe) {

			MatematykaRownanieKwadratowe rownanie = new MatematykaRownanieKwadratowe();
			dispose();
		}

	}
}
