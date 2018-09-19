import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewCollectionWindow extends JFrame{
	JPanel panel;
	JButton home;
	
	public ViewCollectionWindow() {
		this.setBounds(-7, 0, 1400, 733);
		InitialiseComponents();
		this.setVisible(true);
		
	}

	private void InitialiseComponents() {
		// TODO Auto-generated method stub
		panel = new JPanel();
		panel.setBounds(0, 0, this.getWidth(), this.getHeight());
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		home = new JButton();
		home.setBounds(1000, 100, 100, 100);
		home.setText("Home");
		home.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						MainPage mainpagewindow = new MainPage();
						setVisible(false);
						
					}
					
				}
				
				);
		panel.add(home);
		
	}
	

}
