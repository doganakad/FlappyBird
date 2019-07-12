package flappyBird;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class MainMenuClass extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	public JFrame jframe;
	public JTextPane textPane;

	private MainMenuClass(){
		super("Main Menu");
		setSize(1200,720);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		getContentPane().setBackground(new Color(224,234,241));
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args){
		new MainMenuClass().setVisible(true);
		
	}
}
