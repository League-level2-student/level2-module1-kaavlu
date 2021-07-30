package _02_array_list_guestbook;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	String[] names = {"Bob Banders", "Sandy Summers","Greg Ganders", "Donny Doners"};
	
	public void run() {
		// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
		
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		
		button1.setText("Add Name");
		button2.setText("View Names");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		panel.add(button1);
		panel.add(button2);
		
		frame.add(panel);
		
		
		 
		// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
		// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			String input = JOptionPane.showInputDialog("Enter a name");
			names = Arrays.copyOf(names, names.length + 1);
			names[names.length - 1] = input; // Assign 40 to the last element
		}else if(e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, names);
		}
	}

}
