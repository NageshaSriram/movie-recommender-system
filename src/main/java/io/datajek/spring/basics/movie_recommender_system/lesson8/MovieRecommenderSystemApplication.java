package io.datajek.spring.basics.movie_recommender_system.lesson8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);

		String[] result = recommenderImplementation.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));

		ContentBasedFilter cbf1 = applicationContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf2 = applicationContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf3 = applicationContext.getBean(ContentBasedFilter.class);

		System.out.println(cbf1);
		System.out.println(cbf2);
		System.out.println(cbf3);

		CollaborativeFilter cf1 = applicationContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf2 = applicationContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cf3 = applicationContext.getBean(CollaborativeFilter.class);

		System.out.println(cf1);
		System.out.println(cf2);
		System.out.println(cf3);


	}

}
