/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_STRATEGY_adventureGame;

/**
 *
 * @author Cube
 */
public abstract class Character {
	WeaponBehavior weapon;

	public void setWeapon(WeaponBehavior w) {
		weapon = w;
	}

	public void fight() {
		weapon.useWeapon();
	};
}
