package io.datajek.spring.basics.movie_recommender_system.lesson2;

/**
 * @author nageshasriramappa
 **/
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
