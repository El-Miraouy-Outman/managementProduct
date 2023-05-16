package com.example.recommendationservice;

import com.example.recommendationservice.model.Recommandation;
import com.example.recommendationservice.service.RecommandationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RecommendationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecommendationServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(RecommandationService recommandationService){
		return args -> {
			Recommandation recommandation=new Recommandation();
			List.of("mohsine","outman","rida").forEach(up->{
				recommandation.setAuthor(up);
				recommandation.setRate((int)Math.random()*10);
				recommandation.setSubject("rien");
				recommandation.setContent("rein");
				recommandationService.saveRecommandation(recommandation);
			});
		};
	}
}
