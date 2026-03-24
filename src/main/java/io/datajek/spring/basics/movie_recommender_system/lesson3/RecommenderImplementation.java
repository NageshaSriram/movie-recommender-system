package io.datajek.spring.basics.movie_recommender_system.lesson3;

import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
public class RecommenderImplementation   {

    Filter filter;

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }

    public String[] recommendMovies (String movie) {
        System.out.println("Name of the filter in use "+ filter + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
