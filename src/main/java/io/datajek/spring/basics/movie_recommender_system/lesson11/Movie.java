package io.datajek.spring.basics.movie_recommender_system.lesson11;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Movie {

    // for keeping track of the instances created
    private static int instances = 0;

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    private String name;
    private String genre;
    private String producer;

    public Movie() {
        instances++;
        System.out.println("Movie constructor called...");
    }

    public static int getInstances() {
        return Movie.instances;
    }



}
