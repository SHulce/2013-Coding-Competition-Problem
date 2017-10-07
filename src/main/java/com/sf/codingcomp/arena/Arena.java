package com.sf.codingcomp.arena;

public class Arena {

	public Character fight(Character character1, Character character2) throws NoStaminaException {
		
		//calculate attacker and defender values based on readme
		double attackerValue = character1.getAttack() + character1.getDefense()*0.75;
		double defenderValue = character2.getDefense() + character2.getAttack()*0.75;
		
		//Throw exception if attacker is exhausted
		if (character1.getStamina() > 1) { 
			throw new NoStaminaException();
		}
		
		//return winner, tie defaults to attacker victory
		if (defenderValue > attackerValue) { 
			return character2;
		}
		else { 
			return character1;
		}
		
	}
}
