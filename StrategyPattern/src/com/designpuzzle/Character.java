package com.designpuzzle;

public abstract class Character {
      
	WeaponBehavior weaponBehavior;
	
	public Character() {
		
	}
	
	
	public abstract void  display();
	public void haspower() {
		weaponBehavior.useWeapon();
	}
	public void setWeapon(WeaponBehavior wp) {
		weaponBehavior = wp;
	}
	
}
