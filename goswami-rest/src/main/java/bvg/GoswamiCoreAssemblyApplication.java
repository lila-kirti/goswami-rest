package bvg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication (scanBasePackageClasses = GoswamiCoreAssemblyApplication.class)
public class GoswamiCoreAssemblyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoswamiCoreAssemblyApplication.class, args);
	}
}
