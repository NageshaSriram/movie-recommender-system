package io.datajek.spring.basics.movie_recommender_system.lesson5;

/**
 * @author nageshasriramappa
 **/
public interface Filter {
    public String[] getRecommendations(String movie);
}
