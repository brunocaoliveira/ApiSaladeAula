package desafiogenerations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching // Habilita o uso de cache na aplicação
public class DesafiogenerationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafiogenerationsApplication.class, args);
	}

}
