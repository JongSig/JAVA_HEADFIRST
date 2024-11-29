import weapon.SwordBehavior;

public class Game {
	public static void main(String[] args) {
		Character K = new King();
		K.fight();
		K.setWeapon(new SwordBehavior());
		K.Attack();
	}
}
