package io.datajek.spring.basics.movie_recommender_system.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
public class RecommenderImplementation   {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Filter filter;

    @Autowired
    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    public String[] recommendMovies (String movie) {
        System.out.println("Name of the filter in use "+ filter + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("In RecommenderImplementation postConstruct method..dependency injection");

    }

    @PreDestroy
    public void preDestroy() {
        logger.info("In RecommenderImplementation preDestroy method..");
    }
}
