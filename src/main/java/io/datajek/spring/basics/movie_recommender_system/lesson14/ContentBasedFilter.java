package io.datajek.spring.basics.movie_recommender_system.lesson14;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author nageshasriramappa
 **/
//@Component
//@Named
//@Primary
//@Qualifier("CBF")
public class ContentBasedFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Autowired
//    private Movie movie;

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

//    @Lookup
//    public Movie getMovie() {
//        return movie;
//    }

    public String[] getRecommendations(String movie) {

        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
