package io.datajek.spring.basics.movie_recommender_system.lesson12;

import io.datajek.spring.basics.movie_recommender_system.lesson11.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);
		System.out.println("RecommenderImplementation: " + recommenderImplementation);

		System.out.println(recommenderImplementation.getFilter());

	}

}
