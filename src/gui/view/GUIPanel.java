 package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.event.*;
import java.awt.Color;

public class GUIPanel extends JPanel
{
	private GUIAppController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;

	public GUIPanel(GUIAppController baseController)
	{
		this.baseController = baseController;

		baseLayout = new SpringLayout();
		firstButton = new JButton("Please do not click the button");
		
		
		firstTextField = new JTextField("words can be typed here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * helper method to load all GUI components into the panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 36, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, -127, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 64, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 58, SpringLayout.WEST, this);

	}

	private void changeRandomColor()
	{
		int red,green,blue;
		red = (int) (Math.random()*256);
		green= (int) (Math.random()*256); 
		blue = (int) (Math.random()*256);
		
		this.setBackground(new Color(red,green,blue));
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("ow,this is the most amazing click event ever ! WOW!");
			}
		});
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				changeRandomColor();
			}
			
			public void mouseReleased(MouseEvent released)
			{
				
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				changeRandomColor();
			}
			
			public void mouseExited(MouseEvent exited)
			{
				changeRandomColor();
			}
		});
	    this.addMouseMotionListener(new MouseMotionListener()
	 {
	    	public void mouseMoved(MouseEvent moved)
	    	{
	    	if(moved.isAltDown())
	    	{
	    		changeRandomColor();
	    	}
	    		
	    	}
	    	public void mouseDragged(MouseEvent dragged)
	    	{
	    		
	    	}
	 });
	}
	}
