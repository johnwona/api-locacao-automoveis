package br.com.locadora.springbootapi;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient

public class DemoApplication {
	
    @PostConstruct
    void started() {
      TimeZone.setDefault(TimeZone.getTimeZone("TimeZone"));
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
