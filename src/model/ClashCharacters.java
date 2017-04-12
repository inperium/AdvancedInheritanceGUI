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
		return "Name: " + name + " And how badly they'll shreck you in 1 hit: " + levelNumber
				+ " (Each point is how many humans it would kill in 1 blow)\n";
	}

}
