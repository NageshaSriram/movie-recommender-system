package io.datajek.spring.basics.movie_recommender_system.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
public class RecommenderImplementation   {

    @Autowired
    @Qualifier("CF")
    Filter filter;

    public String[] recommendMovies (String movie) {
        System.out.println("Name of the filter in use "+ filter + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
