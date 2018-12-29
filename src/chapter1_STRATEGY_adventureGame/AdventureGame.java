package chapter1_STRATEGY_adventureGame;

public class AdventureGame {

	public static void main(String[] args) {
		Character king = new King();
		king.fight();
		king.setWeapon(new BowAndArrowBehavior());
		king.fight();
	}
}
