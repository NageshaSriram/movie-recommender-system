package io.datajek.spring.basics.movie_recommender_system.lesson14;

//import org.springframework.boot.SpringApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@SpringBootApplication
//@Configuration
//@ComponentScan
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

//		ApplicationContext applicationContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//
//		RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);
//		System.out.println("RecommenderImplementation: " + recommenderImplementation);
//
//		System.out.println(recommenderImplementation.getFilter());

//        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class)) {
//            RecommenderImplementation recommenderImplementation = applicationContext.getBean(RecommenderImplementation.class);
//            System.out.println("RecommenderImplementation: " + recommenderImplementation);
//        }

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");

        System.out.println("\n Beans loaded:");
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

        RecommenderImplementation recommenderImplementation = applicationContext.getBean("recommenderImplementation", RecommenderImplementation.class);
        System.out.println(recommenderImplementation.getFilter());

        String[] results = recommenderImplementation.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(results));

        applicationContext.close();

    }

}
