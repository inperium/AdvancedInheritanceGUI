package model;

public abstract class ClashCharacters {

	private int levelNumber;
	private String name;

	public ClashCharacters(String name, int levelNumber) {
		this.name = name;
		this.levelNumber = levelNumber;
	}

	public int getlevelNumber() {
		return levelNumber;
	}

	public void setlevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Damage per hit: " + levelNumber
				+ "\n";
	}

}
