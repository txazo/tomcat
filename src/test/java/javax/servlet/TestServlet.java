package javax.servlet;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {

    private static final long serialVersionUID = 4611204794014183020L;

    private static final Log log = LogFactory.getLog(TestServlet.class);

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log.info("init()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("doGet()");

        resp.setStatus(HttpServletResponse.SC_OK);
        try {
            resp.getWriter().write("Success");
        } finally {
            resp.getWriter().close();
        }
    }

    @Override
    public void destroy() {
        log.info("destroy()");
    }

}
