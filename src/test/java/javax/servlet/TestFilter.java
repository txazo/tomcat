package javax.servlet;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

import java.io.IOException;

public class TestFilter implements Filter {

    private static final Log log = LogFactory.getLog(TestFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("init()");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("doFilter() begin");
        chain.doFilter(request, response);
        log.info("doFilter() end");
    }

    @Override
    public void destroy() {
        log.info("destroy()");
    }

}
