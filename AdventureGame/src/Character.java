import weapon.*;

public abstract class Character {
	WeaponBehavior weapon;
	
	public abstract void fight();
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
	
	public void Attack() {
		weapon.useWeapon();
	}
}
