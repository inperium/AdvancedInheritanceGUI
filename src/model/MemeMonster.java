package model;

public class MemeMonster implements SpecialMove {

	@Override
	public int hitDamage() {
		return (int) Math.random() * 20;
	}

	@Override
	public int defence() {
		return 20;
	}

	@Override
	public String someName(String name) {
		String returnName = "";
		int times =  (int) Math.random() * 15;
		for(int i = 0; i  < times; i++){
			returnName = name.substring(0, i) + " " + ((char)(Math.random() * 26 + 97)) + " " + name.substring(i + 1);
		}
		return returnName;
	}

	@Override
	public boolean wreckable() {
		return true;
	}
}

