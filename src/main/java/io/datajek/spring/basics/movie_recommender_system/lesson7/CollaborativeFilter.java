package io.datajek.spring.basics.movie_recommender_system.lesson7;

import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
//@Qualifier("CF")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy story"};
    }
}
