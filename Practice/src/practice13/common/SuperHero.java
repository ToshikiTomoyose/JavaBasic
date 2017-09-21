package practice13.common;

public class SuperHero extends Hero {

	private Item equipment;

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

	public int attack() {
		int equpow = super.attack() + equipment.getAdditionalDamage();
		return equpow;
	}

	public Item getEquipment() {
		return equipment;
	}



}
