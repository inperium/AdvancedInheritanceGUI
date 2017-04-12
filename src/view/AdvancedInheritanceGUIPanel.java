
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import controller.AdvancedInheritanceGUIController;

public class AdvancedInheritanceGUIPanel extends JPanel {
	private AdvancedInheritanceGUIController baseController;
	private SpringLayout baseLayout;
	private JButton jacobsButton;
	private JButton isaacsButton;
	private JButton tylersButton;
	private JButton aricksButton;
	private JTextArea stats;

	public AdvancedInheritanceGUIPanel(AdvancedInheritanceGUIController baseController) {
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		jacobsButton = new JButton("Jacob's Clash Character");
		isaacsButton = new JButton("Isaac's Clash Character");
		tylersButton = new JButton("Tyler's Clash Character");
		aricksButton = new JButton("Arick's Clash Character");

		stats = new JTextArea("");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel() {
		this.setLayout(baseLayout);
		this.add(stats);
		this.setBackground(Color.BLUE);
		this.add(jacobsButton);
		this.add(isaacsButton);
		this.add(tylersButton);
		this.add(aricksButton);
	}

	private void setupLayout() {
		baseLayout.putConstraint(SpringLayout.NORTH, isaacsButton, 0, SpringLayout.NORTH, jacobsButton);
		baseLayout.putConstraint(SpringLayout.WEST, isaacsButton, 12, SpringLayout.EAST, tylersButton);
		baseLayout.putConstraint(SpringLayout.NORTH, tylersButton, 0, SpringLayout.NORTH, jacobsButton);
		baseLayout.putConstraint(SpringLayout.WEST, tylersButton, 6, SpringLayout.EAST, aricksButton);
		baseLayout.putConstraint(SpringLayout.NORTH, aricksButton, 0, SpringLayout.NORTH, jacobsButton);
		baseLayout.putConstraint(SpringLayout.WEST, aricksButton, 5, SpringLayout.EAST, jacobsButton);
		baseLayout.putConstraint(SpringLayout.WEST, jacobsButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, jacobsButton, -10, SpringLayout.SOUTH, this);

	}

	private void setupListeners() {
		aricksButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent performed) {
				stats.setText(baseController.arickClicked());
			}
		});

		isaacsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent performed) {
				stats.setText(baseController.isaacClicked());
			}
		});

		jacobsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent performed) {
				stats.setText(baseController.jacobClicked());
			}
		});
		tylersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent performed) {
				stats.setText(baseController.tylerClicked());
			}
		});
	}
}
