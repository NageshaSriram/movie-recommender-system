package io.datajek.spring.basics.movie_recommender_system.lesson13;

import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
public interface Filter {
    public String[] getRecommendations(String movie);
}
