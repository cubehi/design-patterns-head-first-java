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
public class King extends Character {
	public King() {
		weapon = new SwordBehavior();
	}
}
