package controller;

import java.util.ArrayList;

import model.Archer;
import model.Barbarians;
import model.Giants;
import model.MiniDragon;
import model.SpecialMove;
import view.AdvancedInheritanceGUIFrame;

public class AdvancedInheritanceGUIController {

	private ArrayList<SpecialMove> specialMove;

	AdvancedInheritanceGUIFrame baseFrame;

	public AdvancedInheritanceGUIController() {
		baseFrame = new AdvancedInheritanceGUIFrame(this);
		this.specialMove = new ArrayList<>();
	}

	public void start() {

	}
	
	//Create Clash Characters On Button CLick

	public String isaacClicked() {
		String isaac = "";
		if (new MiniDragon() instanceof SpecialMove) {
			specialMove.add(new MiniDragon());
			isaac = specialMove.toString();
		}
		return isaac;
	}

	public String jacobClicked() {
		String jacob = "";
		if (new Giants() instanceof SpecialMove) {
			specialMove.add(new Giants());
			jacob = specialMove.toString();
		}
		return jacob;
	}

	public String tylerClicked() {
		String tyler = "";
		if (new Barbarians() instanceof SpecialMove) {
			specialMove.add(new Barbarians());
			tyler = specialMove.toString();
		}
		return tyler;
	}

	public String arickClicked() {
		String arick = "";
		if (new Barbarians() instanceof SpecialMove) {
			specialMove.add(new Barbarians());
			arick = specialMove.toString();
		}
		return arick;
	}

}