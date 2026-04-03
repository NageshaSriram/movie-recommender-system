package io.datajek.spring.basics.movie_recommender_system.lesson12;

import jakarta.inject.Named;
import org.springframework.context.annotation.Scope;

/**
 * @author nageshasriramappa
 **/
@Named
@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CollaborativeFilter implements Filter {

    public CollaborativeFilter() {
        System.out.println("CollaborativeFilter is created...");
    }
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy story"};
    }
}
