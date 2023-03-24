package ezen.springbasic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ezen.springbasic.core.AutoAppConfig;
import ezen.springbasic.core.Unit;
import ezen.springbasic.core.Weapon;

@SpringBootTest //이제 스프링 부트를 이용한다. 이게
//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoAppConfig.class); 이게 자동으로 됨. 컨테이너 만드는거.
public class SpringContainerTest2 {
	
	@Autowired
	Unit unit; //자동으로 마린을 찾아오는? 오토와이어드니까?
	
	@Autowired
	@Qualifier("club")
	Weapon weapon; //이거도 위에 unit 자동엮음이랑 비슷한데, 객체가 3개니까 club으로 특정하기.
		
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
