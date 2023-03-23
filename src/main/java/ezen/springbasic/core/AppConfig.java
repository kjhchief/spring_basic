package ezen.springbasic.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 객체 생성 및 생성된 객체간의 의존관계 설정(조립자 역할) - 기존의 ServiceFactory 역할 
@Configuration
// 스프링 컨테이너 설정 파일로 사용
public class AppConfig {
	
	@Bean
	public Weapon weapon() {
//		return new Gun();
		return new Sword();
	}
	
	@Bean
	public Unit unit() {
		return new Marine("방그리", 1, weapon());
	}
}
