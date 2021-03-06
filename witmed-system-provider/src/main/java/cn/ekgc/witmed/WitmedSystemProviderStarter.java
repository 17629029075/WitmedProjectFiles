package cn.ekgc.witmed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("cn.ekgc.witmed.*.*.dao")
@EnableEurekaClient
@SpringBootApplication
public class WitmedSystemProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(WitmedSystemProviderStarter.class, args);
	}
}
