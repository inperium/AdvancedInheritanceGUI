package model;

public class MiniDragon extends ClashCharacters implements SpecialMove
{
	public MiniDragon()
	{
		super("MiniDragon", 100);
	}
	
	public int hitDamage()
	{
		return 80;
	}
	public String someName(String name)
	{
		if(name.contains("o") || name.contains("O"))
		{
			name.replace("o", "derp");
			name.replace("O", "DERP");
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
		return 700;
	}
}
