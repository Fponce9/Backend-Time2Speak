package pe.edu.upc.time2speak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import pe.edu.upc.time2speak.config.SwaggerConfig;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class Time2speakApplication {

	public static void main(String[] args) {
		SpringApplication.run(Time2speakApplication.class, args);
	}

}
