package ezen.springbasic.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		
//		new ClassPathXmlApplicationContext("spring-config.xml");
		// 스프링 빈 컨테이너 생성! 스프링 애플리케이션 실행 환경
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		// 스프링 컨테이너 안에는 
		
		
		// 스프링 컨테이너에서 빈 조회(빈의 이름으로)
//		Unit unit = (Unit)applicationContext.getBean("unit");
		Unit unit = applicationContext.getBean("unit", Unit.class);
		unit.offense();
		
		// 빈의 타입으로 조회
		unit = applicationContext.getBean(Unit.class);
		unit.offense();
		unit.deffense();
		
		// 등록된 빈 모두 조회
		int count = applicationContext.getBeanDefinitionCount();
		System.out.println("빈의 갯수 : " + count);
		String[] beanNames = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println(beanName+" : " + applicationContext.getBean(beanName));
		}
	}
}







