package ezen.springbasic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import ezen.springbasic.core.Unit;
import ezen.springbasic.core.Weapon;

@SpringBootTest
public class SpringContainerTest2 {
	
	@Autowired	
	Unit unit;
	
	@Autowired
	@Qualifier("club")
	Weapon weapon;
		
	@Test
	public void containerTest() {
		unit.offense();
		unit.deffense();
	}
	
	@Test
	public void containerTest2() {
		weapon.attack();
	}
}
