package exemplo;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JanelaHeranca extends JFrame {
	
	private JMenuBar menuBar;
	private JMenu menuFile, menuEdit;
	private JMenuItem menuItemOpen, menuItemClose, menuItemPreferences;
	private JLabel barraDeStatus;
	private JPanel painelCentral;
	
	public JanelaHeranca(int width, int height) {
		super("Primeira Janela");
		
		setLayout(new BorderLayout());
		painelCentral = new JPanel(new GridLayout(5,5));
		
		
		setSize(width, height);
		
		menuItemOpen = new JMenuItem("Open");
		menuItemClose = new JMenuItem("Close");
		
				
		menuItemOpen.addActionListener(
				(evento) -> { 
					barraDeStatus.setText("Abrindo o arquivo lpoo.txt");
					
					JLabel conteudo1 = new JLabel("Oi, essa é a disciplina de LPOO.");
					JLabel conteudo2 = new JLabel("Tchau, essa é a disciplina de LPOO.");
					
					painelCentral.add(conteudo1);
					painelCentral.add(conteudo2);
				}
		);
		
		menuItemClose.addActionListener(
				(evento) -> {
				}
		);
		
		
		
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
		
		barraDeStatus = new JLabel("Barra de status");
		
		
		add(barraDeStatus, BorderLayout.SOUTH);
		add(painelCentral, BorderLayout.CENTER);
	}

}
