package dev.avanish.buildresume;

import dev.avanish.buildresume.repo.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class BuildResumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildResumeApplication.class, args);
	}

}
