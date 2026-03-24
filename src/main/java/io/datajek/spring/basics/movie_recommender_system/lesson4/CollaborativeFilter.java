package io.datajek.spring.basics.movie_recommender_system.lesson4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
@Primary
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy story"};
    }
}
