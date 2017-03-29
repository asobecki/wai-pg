package pl.pg.asobecki.wai;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by asobecki on 29.03.17.
 */
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.getWriter().println("Hello students!");
    }

    // Initializer
    @Override
    public void init() throws  ServletException {
        System.out.println("Java Servlet " + this.getServletName() + " has started.");
    }
    // Destroyer
    public void destroyer() {
        System.out.println("Java Servlet " + this.getServletName() + " has stopped.");
    }
}
