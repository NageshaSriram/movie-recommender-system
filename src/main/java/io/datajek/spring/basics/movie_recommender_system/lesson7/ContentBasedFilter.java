package io.datajek.spring.basics.movie_recommender_system.lesson7;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
//@Primary
//@Qualifier("CBF")
public class ContentBasedFilter implements Filter {

    public String[] getRecommendations(String movie) {

        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
