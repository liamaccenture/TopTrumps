import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainPage extends JFrame {
	
	//Variables
	JPanel panel;
	JButton viewCollectionButton;
	JButton playGameButton;

	//Constructor
	public MainPage() {
		
		this.setBounds(100, 100, 1200, 800);
		InitialiseComponents();
		this.setVisible(true);
		
	}
	
	//Methods
	public void InitialiseComponents() {
		panel = new JPanel();
		panel.setBounds(0, 0, this.getWidth(), this.getHeight());
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
/* Waiting for Lucky to make the viewCollectionWindow
  		viewCollectionButton = new JButton();
 
		viewCollectionButton.setText("VIEW COLLECTION");
		viewCollectionButton.setBounds(0, 0, 600, 400);
		
		viewCollectionButton.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						ViewCollectionWindow viewCollectionWindow = new ViewCollectionWindow(); 
						setVisible(false);
				}
				
				
				);
		
		panel.add(viewCollectionWindow);

/*		
		playGameButton = new JButton();
		 
		playGameButton.setText("PLAY GAME");
		playGameButton.setBounds(0, 0, 600, 400);
		
		playGameButton.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						PlayGameWindow playGameWindow = new PlayGameWindow(); 
						setVisible(false);
				}
				
				
				);
		
		panel.add(playGameWindow);
*/		
		
	}
	
	

}
