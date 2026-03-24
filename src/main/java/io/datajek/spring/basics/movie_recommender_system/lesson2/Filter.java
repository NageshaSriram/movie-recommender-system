package io.datajek.spring.basics.movie_recommender_system.lesson2;

/**
 * @author nageshasriramappa
 **/
public interface Filter {
    public String[] getRecommendations(String movie);
}
