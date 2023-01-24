package orh.fi.springboot.thirdmvcboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"orh.fi.springboot.thirdmvcboot.controllers"})
public class ThirdmvcbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThirdmvcbootApplication.class, args);
	}

}
