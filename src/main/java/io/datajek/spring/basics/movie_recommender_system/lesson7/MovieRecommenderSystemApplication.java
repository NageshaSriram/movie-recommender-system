package io.datajek.spring.basics.movie_recommender_system.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation2 recommenderImplementation = applicationContext.getBean(RecommenderImplementation2.class);

		String[] result = recommenderImplementation.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));

	}

}
