import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		this.setBounds(-7, 0, 1400, 733);
		InitialiseComponents();
		this.setVisible(true);
		
	}
	
	//Methods
	public void InitialiseComponents() {
		panel = new JPanel();
		panel.setBounds(0, 0, this.getWidth(), this.getHeight());
		panel.setLayout(null);
		this.getContentPane().add(panel);
		

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
				
				
				});
		
		panel.add(viewCollectionButton);

/*		
		playGameButton = new JButton();
		 
		playGameButton.setText("PLAY GAME");
		playGameButton.setBounds(0, 0, 900, 700);
		
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
