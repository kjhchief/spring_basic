package ezen.springbasic.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Marine implements Unit {
	
	private String name;
	private int level;
	
	@Autowired
	@Qualifier("gun")
	private Weapon weapon;
	
	public Marine() {}

	public Marine(String name, int level, Weapon weapon) {
		this.name = name;
		this.level = level;
		this.weapon = weapon;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public void offense() {
		weapon.attack();
	}

	@Override
	public void deffense() {
		System.out.println("방어합니다..");
	}

	@Override
	public String toString() {
		return "Marine [name=" + name + ", level=" + level + ", weapon=" + weapon + "]";
	}
}
