package io.datajek.spring.basics.movie_recommender_system.lesson13;

//import org.springframework.boot.SpringApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

//		ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//
//		RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);
//		System.out.println("RecommenderImplementation: " + recommenderImplementation);
//
//		System.out.println(recommenderImplementation.getFilter());

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class)) {
            RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);
            System.out.println("RecommenderImplementation: " + recommenderImplementation);
        }

    }

}
