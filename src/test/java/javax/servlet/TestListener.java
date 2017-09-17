package javax.servlet;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class TestListener implements ServletContextListener {

    private static final Log log = LogFactory.getLog(TestListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("contextInitialized()");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("contextDestroyed()");
    }

}
