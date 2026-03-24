package io.datajek.spring.basics.movie_recommender_system.lesson1;

/**
 * @author nageshasriramappa
 **/
public class RecommenderImplementation   {

    public String[] recommendMovies (String movie) {
        ContentBasedFilter contentBasedFilter = new ContentBasedFilter();
        String[] results = contentBasedFilter.getRecommendations(movie);
        return results;
    }
}
