package io.datajek.spring.basics.movie_recommender_system.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
public class RecommenderImplementation   {

    @Autowired
    Filter filter;

    public String[] recommendMovies (String movie) {
        System.out.println("Name of the filter in use "+ filter + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
