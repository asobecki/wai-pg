package pl.pg.asobecki.wai;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by asobecki on 29.03.17.
 */
@WebServlet(
        name = "secondServlet",
        urlPatterns = {"/second", "/also-second"},
        loadOnStartup = 1
)
public class SecondServlet extends HttpServlet {
    private static final String DEFAULT_STUDENT = "Anonymous";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String user = request.getParameter("user");
        if(user == null)
            user = SecondServlet.DEFAULT_STUDENT;

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();
        writer.append("<!DOCTYPE html>\r\n")
                .append("<html>\r\n")
                .append("   <head>\r\n")
                .append("       <title>Second servlet for students</title>\r\n")
                .append("   </head>\r\n")
                .append("   <body>\r\n")
                .append("       Hello student: ").append(user).append("! Is nice to you.<br/><br/>\r\n")
                .append("       <form action=\"second\" method=\"POST\">\r\n")
                .append("           Enter your name:<br/>\r\n")
                .append("           <input type=\"text\" name=\"user\" /><br/>")
                .append("           <input type=\"submit\" value=\"Send\"/>\r\n")
                .append("       </form>\r\n")
                .append("   </body>\r\n")
                .append("</html>\r\n");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
