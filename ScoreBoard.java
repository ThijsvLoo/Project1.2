import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static java.lang.System.*;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;


import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.*;
import java.io.*;
/**
 * @author Maaike, Jonas, Andreas, Thijs
 */

public class ScoreBoard extends JFrame{
	JTextField firstName;
	JTextField firstScore;
	JTextField secondName;
	JTextField secondScore;
	JTextField thirdName;
	JTextField thirdScore;
	JButton button;
	
	public ScoreBoard(){
		createComponents();
		
		this.setSize(300, 300);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	/**
	 * Creates the components for the scoreboard and adds them to a panel
	 */
	public void createComponents(){
	
		
		//createButton();
		createLabels();
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout( new GridLayout(3,2));
		panel.add(firstName);
		panel.add(firstScore);
		panel.add(secondName);
		panel.add(secondScore);
		panel.add(thirdName);
		panel.add(thirdScore);
		
		mainPanel.add(panel, BorderLayout.CENTER);
		this.add(mainPanel);
	}

	/**
	 * Create the score labels by reading from the textfile
	 *
	 */
	public void createLabels(){
		 firstName =  new JTextField(20);
		 firstScore = new JTextField(10);
		 secondName = new JTextField(20);
		 secondScore = new JTextField(10);
		 thirdName = new JTextField(20);
		 thirdScore = new JTextField(10);
		 		try{
			FileReader reader = new FileReader("scoreList.txt");
			Scanner in = new Scanner(reader);
				firstName.setText("Legend of Legends: " + in.next());
				firstScore.setText(in.next() + " Points");
				secondName.setText("Second Heir: " + in.next());
				secondScore.setText(in.next() + " Points");
				thirdName.setText("Legend's Guardian: " + in.next());
				thirdScore.setText(in.next() + " Points");
		
			reader.close();
		} catch(Exception e) {
			System.out.println("Someting wong");
		}
	}
	
	
}
