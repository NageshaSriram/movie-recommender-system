package io.datajek.spring.basics.movie_recommender_system.lesson8;

import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
//@Primary
//@Qualifier("CBF")
public class ContentBasedFilter implements Filter {

    public ContentBasedFilter() {
        System.out.println("ContentBasedFilter is created...");
    }

    public String[] getRecommendations(String movie) {

        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
