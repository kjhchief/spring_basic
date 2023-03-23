package ezen.springbasic.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "ezen.springbasic")
//@ComponentScan(basePackages = {"ezen.springbasic", "xxx.yyy.zzz"})
@ComponentScan
public class AutoAppConfig {}
