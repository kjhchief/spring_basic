package ezen.springbasic.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 객체 생성 및 생성된 객체간의 의존관계 설정(조립자 역할) - 기존의 ServiceFactory 역할 
// 원래 스프링이 하는건데 쌤이 걍 만들어본것임
//@Configuration
// 스프링 컨테이너 설정 파일로 사용
public class AppConfig {
	
	@Bean //스프링 컨테이너에 호출해서 하나 생성해놓는다.
	public Weapon weapon() {
//		return new Gun();
		return new Sword();
	}
	
	@Bean
	public Unit unit() {
		return new Marine("방그리", 1, weapon());
	}
	
	@Bean
	public String string() {
		return new String("김기정");
	}
}
