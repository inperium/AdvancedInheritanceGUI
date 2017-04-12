package model;

public class Barbarians extends ClashCharacters implements SpecialMove
{
	public Barbarians()
	{
		super("Barbarians", 34);
	}
	public int hitDamage()
	{
		return 800;
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
		return 1000;
	}
}
