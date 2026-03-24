package io.datajek.spring.basics.movie_recommender_system.lesson2;

/**
 * @author nageshasriramappa
 **/
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy story"};
    }
}
