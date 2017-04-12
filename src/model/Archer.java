package model;

public class Archer
extends ClashCharacters implements SpecialMove
{
	public Archer()
	{
		super("Archer", 34);
	}
	public int hitDamage()
	{
		return 600;
	}
	public String someName(String name)
	{
		if(name.contains("a") || name.contains("A"))
		{
			name.replace("a", "derp");
			name.replace("A", "DERP");
		}
		else
		{
			name += "Clash" + name + "Royale";
		}
		return name;
	}
	public boolean wreckable()
	{
		return false;
	}
	
	public int defence()
	{
		return 800;
	}
}
