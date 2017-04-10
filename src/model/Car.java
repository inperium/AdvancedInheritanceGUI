package model;

public class Car implements SpecialMove {

	@Override
	public int hitDamage() {
		int damage = (int) Math.random()*20+1;
		return damage;
	}

	@Override
	public String someName(String name) {
		if(!name.toLowerCase().equals("lamborghini")){
			name += " car";
		}
		return name;
	}

	@Override
	public boolean wreckable() {
		return true;
	}
	
	@Override
	public int defence() {
		int defence = (int) Math.random()*10+1;
		return defence;
	}

}
