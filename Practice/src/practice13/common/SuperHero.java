package practice13.common;

public class SuperHero extends Hero {
	private Item equipment;

	public int power() {
		equipment = power() + Item.additionalDamege;
	}

	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

}
