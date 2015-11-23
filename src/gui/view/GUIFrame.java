package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIAppController;

/**
 * @author madeleine hales @ version 0.2xNov 9, 2015 updated the setupFrame to
 *         load the contentOane with a GUIPanel.
 */
public class GUIFrame extends JFrame
{
	private GUIAppController baseController;
	private GUIPanel basePanel;

	public GUIFrame(GUIAppController baseController)
	{
		this.baseController = baseController;
		basePanel=new GUIPanel(baseController);
		setUpFrame();
	}

	private void setUpFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
	}

	public GUIAppController getBaseController()
	{
		return baseController;
	}
}