package pl.pg.asobecki.wai;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by asobecki on 17.03.2018.
 */
public class LogFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Initialization parameter: " +filterConfig.getInitParameter("test-param"));
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("request local address: "+servletRequest.getLocalAddr());
        System.out.println("request remote address: "+servletRequest.getRemoteAddr());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        System.out.println("Destroying LogFilter class object");
    }
}
