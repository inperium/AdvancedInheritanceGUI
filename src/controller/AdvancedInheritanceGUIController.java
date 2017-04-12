package controller;

import java.util.ArrayList;

import model.ClashCharacters;
import model.MemeMonster;
import model.MiniDragon;
import model.SpecialMove;

public class AdvancedInheritanceGUIController {

	private ArrayList<ClashCharacters> clash;
	
	public void start()
	{
		ArrayList<SpecialMove> specialMove = new ArrayList<SpecialMove>();
		if(new Car() instanceof SpecialMove)
		{
			specialMove.add(new Car());
		}
		if(new MemeMonster() instanceof SpecialMove)
		{
			specialMove.add(new MemeMonster());
		}
		if(new ScrubLord() instanceof SpecialMove)
		{
			specialMove.add(new MiniDragon());
		}
		System.out.println(specialMove);
	}
}