package io.datajek.spring.basics.movie_recommender_system.lesson12;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Named
public class RecommenderImplementation   {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Autowired
    @Inject
//    @Qualifier("CF")
    private Filter collaborativeFilter;

//    @Autowired
//    @Qualifier("CF")
//    public void setFilter(Filter filter) {
//        logger.info("In RecommenderImplementation setter method..dependency injection");
//        this.filter = filter;
//    }

    public Filter getFilter() {
        return this.collaborativeFilter;
    }
    public String[] recommendMovies (String movie) {
        System.out.println("Name of the filter in use "+ collaborativeFilter + "\n");
        String[] results = collaborativeFilter.getRecommendations(movie);
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
