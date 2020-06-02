package exemplo;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JanelaHeranca extends JFrame {
	
	private JMenuBar menuBar;
	private JMenu menuFile, menuEdit;
	private JMenuItem menuItemOpen, menuItemClose, menuItemPreferences;
	private JLabel label1, label2;
	
	public JanelaHeranca(int width, int height) {
		super("Primeira Janela");
		
		setLayout(new BorderLayout());
		
		setSize(width, height);
		
		menuItemOpen = new JMenuItem("Open");
		menuItemClose = new JMenuItem("Close");
		menuItemPreferences = new JMenuItem("Preferences");
		menuFile = new JMenu("File");
		menuEdit = new JMenu("Edit");
		menuBar = new JMenuBar();
		
		menuFile.add(menuItemOpen);
		menuFile.add(menuItemClose);
		
		menuEdit.add(menuItemPreferences);
		
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		
		setJMenuBar(menuBar);
		
		label1 = new JLabel("Meu primeiro label");
		label2 = new JLabel("Meu segundo label");
		
		add(label1, BorderLayout.SOUTH);
		add(label2, BorderLayout.NORTH);
	}

}
