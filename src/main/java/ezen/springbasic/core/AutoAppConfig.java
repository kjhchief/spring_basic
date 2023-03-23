package ezen.springbasic.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "ezen.springbasic") //패키지 밑에 클래스들 알아서 싹등록.
//@ComponentScan(basePackages = {"ezen.springbasic", "xxx.yyy.zzz"}) // 배열로 되어있다
@ComponentScan
public class AutoAppConfig {}
