package io.datajek.spring.basics.movie_recommender_system.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
public class RecommenderImplementation2 {

//    @Autowired
//    @Qualifier("CF")
    Filter filter;

//    @Autowired
//    public RecommenderImplementation2(@Qualifier("collaborativeFilter") Filter filter) {
//        super();
//        this.filter = filter;
//        System.out.println("Constructor invoked...");
//    }

    @Autowired
    @Qualifier("collaborativeFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked...");
    }

    public String[] recommendMovies (String movie) {
        System.out.println("Name of the filter in use "+ filter + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
