package io.datajek.spring.basics.movie_recommender_system.lesson11;

import io.datajek.spring.basics.movie_recommender_system.lesson11.Filter;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author nageshasriramappa
 **/
@Component
//@Primary
//@Qualifier("CBF")
public class ContentBasedFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        super();
        logger.info("In ContentBasedFilter constructor...");
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("In ContentBasedFilter postConstruct method...");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("In ContentBasedFilter preDestroy method...");
    }

    @Lookup
    public Movie getMovie() {
        return movie;
    }

    public String[] getRecommendations(String movie) {

        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
