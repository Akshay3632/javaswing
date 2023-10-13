package javaAssignment;
import javax.swing.*;
import java.awt.event.*;
public class ComboBoxExample {
	JFrame f;
	ComboBoxExample() {
		f = new JFrame("combo box example");
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400, 100);
		JButton b = new JButton("show");
		b.setBounds(200, 100, 75, 20);
		String languages[] = { "c", "c++", "c#", "java", "php" };
		final JComboBox cb = new JComboBox(languages);
		cb.setBounds(50, 100, 90, 20);
		f.add(cb);
		f.add(label);
		f.add(b);
		f.setSize(350, 350);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "programming language selected:" + cb.getItemAt(cb.getSelectedIndex());
				label.setText(data);
			}
		});
	}

	public static void main(String[] args) {
		new ComboBoxExample();
	}
}