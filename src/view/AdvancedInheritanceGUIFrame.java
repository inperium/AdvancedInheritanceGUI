package view;

import java.awt.Dimension;
import javax.swing.JFrame;


import controller.AdvancedInheritanceGUIController;

public class AdvancedInheritanceGUIFrame extends JFrame
{
	private AdvancedInheritanceGUIController baseController;
	private AdvancedInheritanceGUIPanel basePanel;
	
	public AdvancedInheritanceGUIFrame(AdvancedInheritanceGUIController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new AdvancedInheritanceGUIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Inheritance");
		this.setSize(new Dimension(1080, 600));
		this.setResizable(false);
		this.setVisible(true);
	}
	public AdvancedInheritanceGUIController getBaseController()
	{
		return baseController;
	}
	public void setBaseController(AdvancedInheritanceGUIController baseController)
	{
		this.baseController = baseController;
	}
}
