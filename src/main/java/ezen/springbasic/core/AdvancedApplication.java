package ezen.springbasic.core;

public class AdvancedApplication {

	public static void main(String[] args) {
		// 애플리케이션의 객체를 생성하고 생성된 객체간 의존관계 설정 역할의 객체
		AppConfig appConfig = new AppConfig();
		Weapon weapon = appConfig.weapon(); 
		Unit unit = appConfig.unit(); // AppConfig을 거쳐가는 느낌. 조립하는 역할이구나.
		unit.offense();
		unit.deffense();
	}
}
