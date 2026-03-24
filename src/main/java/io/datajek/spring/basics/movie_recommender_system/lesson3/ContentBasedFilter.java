package io.datajek.spring.basics.movie_recommender_system.lesson3;

import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
public class ContentBasedFilter implements Filter {

    public String[] getRecommendations(String movie) {

        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
