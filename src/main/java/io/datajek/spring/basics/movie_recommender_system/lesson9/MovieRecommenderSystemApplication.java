package io.datajek.spring.basics.movie_recommender_system.lesson9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages={"io.datajek.spring.basics.movie_recommender_system.lesson9", "io.datajek.spring.basics.movie_recommender_system.lesson10"})
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//
//		ContentBasedFilter filter = applicationContext.getBean(ContentBasedFilter.class);
//		System.out.println("\nContentBasedFilter bean with singleton scope");
//		System.out.println(filter);
//
//		Movie movie1 = filter.getMovie();
//		Movie movie2 = filter.getMovie();
//		Movie movie3 = filter.getMovie();
//
//		System.out.println("\nMovie bean with prototype scope");
//		System.out.println(movie1);
//		System.out.println(movie2);
//		System.out.println(movie3);
//
//		System.out.println("\nContentBasedFilter instance created: " + ContentBasedFilter.getInstances());
//		System.out.println("\nMovie instance created: " + Movie.getInstances());


		System.out.println("ContentBasedFilter bean found = " + applicationContext.containsBean("contentBasedFilter"));
		System.out.println("CollaborativeFilter bean found = " + applicationContext.containsBean("collaborativeFilter"));

	}

}
