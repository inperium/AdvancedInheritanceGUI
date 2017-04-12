package model;

public class Giants extends ClashCharacters implements SpecialMove
{
	public Giants()
	{
		super("Giants", 34);
	}
	public int hitDamage()
	{
		return 12600;
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
		return 12000;
	}
}
