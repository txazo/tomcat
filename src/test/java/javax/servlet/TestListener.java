package javax.servlet;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class TestListener implements ServletContextListener {

    private static final Log LOG = LogFactory.getLog(TestListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOG.info("contextInitialized()");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOG.info("contextDestroyed()");
    }

}
